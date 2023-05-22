import java.util.Scanner;

public class ProjetoCalculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora");

    do {
        System.out.println("Informe o primeiro número: ");
        calculadora.setNumeroUm(scan.nextDouble());

        System.out.println("Informe o segundo número: ");
        calculadora.setNumeroDois(scan.nextDouble());

        System.out.println("Escolha uma operação matemática:\nAdição = Digite 1\nSubtração = Digite 2\nMultiplicação = Digite 3\nDivisão = Digite 4\nPotência = Digite 5\nRaiz Quadrada = Digite 6");
        calculadora.setescolherOperacaoMatematica(scan.nextByte());

    while (calculadora.getescolherOperacaoMatematica() != 1 && calculadora.getescolherOperacaoMatematica() != 2 && calculadora.getescolherOperacaoMatematica() != 3
            && calculadora.getescolherOperacaoMatematica() != 4 && calculadora.getescolherOperacaoMatematica() != 5 && calculadora.getescolherOperacaoMatematica() != 6) {

        System.out.println("\nEscolha uma operação matemática valida!");

        System.out.println("Adição = Digite 1\nSubtração = Digite 2\nMultiplicação = Digite 3\nDivisão = Digite 4\nPotência = Digite 5\nRaiz Quadrada = Digite 6");
        calculadora.setescolherOperacaoMatematica(scan.nextByte());
     }

    switch (calculadora.getescolherOperacaoMatematica()) {

        case 1:
            calculadora.calcularAdicao();
            System.out.printf("Resultado da Adição: %.2f", calculadora.getresultadoSoma());
                break;

        case 2:
            calculadora.calcularSubtracao();
            System.out.printf("Resultado da Subtração: %.2f", calculadora.getresultadoSubtracao());
                break;

        case 3:
            calculadora.calcularmultiplicacao();
            System.out.printf("Resultado da Multiplicação: %.2f", calculadora.getresultadoMultiplicacao());
                break;

        case 4:
            if (calculadora.getNumeroDois() != 0) {
                calculadora.calcularDivisao();
                System.out.printf("Resultado da Divisão: %.2f", calculadora.getresultadoDivisao());
                break;

            } else { System.out.println("Impossível realizar uma divisão por zero!");
                break;
            }

        case 5:
            calculadora.calcularPotencia();
            System.out.printf("Resultado da Potência: %.2f", calculadora.getresultadoPotencia());
                break;

        case 6:
            if (calculadora.getNumeroUm() > 0) {
                calculadora.calcularRaizQuadrada();
                System.out.printf("Resultado da Raiz Quadreada: %.2f", calculadora.getresultadoRaizQuadrada());
                break;

            } else { System.out.println("Não existe raiz de número negativo!");
                break;
            }
        } 

        System.out.println("\nPara sair da calculadora digite 'Q'\nPara realizar outra operação matemática, aperte qualquer tecla:");
        scan.nextLine();
        calculadora.setsairDaCalculadora(scan.nextLine());

    } while (!calculadora.getsairDaCalculadora().equalsIgnoreCase("q"));

        scan.close();
    }
}