import java.util.Scanner;

public class ProjetoCalculadora {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        Calculadora calculadora = new Calculadora();

        System.out.println("Calculadora");

        String sairDaCalculadora = " ";

        do {

            System.out.println("Informe o primeiro número: ");
            calculadora.setNumeroUm(scan.nextDouble());

            System.out.println("Informe o segundo número: ");
            calculadora.setNumeroDois(scan.nextDouble());

            System.out.println("Escolha uma operação matemática:\nAdição = Digite 1\nSubtração = Digite 2\nMultiplicação = Digite 3\nDivisão = Digite 4\nPotência = Digite 5\nRaiz Quadrada = Digite 6");
            byte operacaoMatematica = scan.nextByte();

            while (operacaoMatematica != 1 && operacaoMatematica != 2 && operacaoMatematica != 3
                    && operacaoMatematica != 4 && operacaoMatematica != 5 && operacaoMatematica != 6) {

                System.out.println("\nEscolha uma operação matemática valida!");

                System.out.println("Adição = Digite 1\nSubtração = Digite 2\nMultiplicação = Digite 3\nDivisão = Digite 4\nPotência = Digite 5\nRaiz Quadrada = Digite 6");
                operacaoMatematica = scan.nextByte();
            }

            switch (operacaoMatematica) {

                case 1:
                    double resultadoSoma = calculadora.calcularAdicao();
                    System.out.printf("Resultado da Adição: %.2f", resultadoSoma);
                    break;

                case 2:
                    double resultadoSubtracao = calculadora.calcularSubtracao();
                    System.out.printf("Resultado da Subtração: %.2f", resultadoSubtracao);
                    break;

                case 3:
                    double resultadoMultiplicacao = calculadora.calcularmultiplicacao();
                    System.out.printf("Resultado da Multiplicação: %.2f", resultadoMultiplicacao);
                    break;

                case 4:
                    if (calculadora.getNumeroDois() != 0) {
                        double resultadoDivisao = calculadora.calcularDivisao();
                        System.out.printf("Resultado da Divisão: %.2f", resultadoDivisao);
                    } else {
                        System.out.println("Impossível realizar uma divisão por zero!");
                        break;
                    }

                case 5:
                    double resultadoPotencia = calculadora.calcularPotencia();
                    System.out.printf("Resultado da Potência: %.2f", resultadoPotencia);
                    break;

                case 6:
                    if (calculadora.getNumeroUm() > 0) {
                        double resultadoRaizQuadrada = calculadora.calcularRaizQuadrada();
                        System.out.printf("Resultado da Raiz Quadreada: %.2f", resultadoRaizQuadrada);
                    } else {
                        System.out.println("Não existe raiz de número negativo!");
                        break;
                    }
                    scan.close();
            }

            System.out.println("\nPara sair da calculadora digite 'Q'\nPara realizar outra operação matemática, aperte qualquer tecla:");
            scan.nextLine();
            sairDaCalculadora = scan.nextLine();

        } while (!sairDaCalculadora.equalsIgnoreCase("q"));
    }
}