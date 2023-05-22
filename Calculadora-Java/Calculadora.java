public class Calculadora {
    
    private double numeroUm, numeroDois, resultadoSoma, resultadoSubtracao, resultadoMultiplicacao, resultadoDivisao, resultadoPotencia, resultadoRaizQuadrada;
    private String sairDaCalculadora = " ";
    private byte operacaoMatematica;

    public void setNumeroUm(double novoValorNumeroUm) {
        numeroUm = novoValorNumeroUm;
    }

    public void setNumeroDois(double novoValorNumeroDois) {
        numeroDois = novoValorNumeroDois;
    }

    public double getNumeroUm() {
        return numeroUm;
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public double calcularAdicao() {
        resultadoSoma = (numeroUm + numeroDois);
        return resultadoSoma;
    }

    public double calcularSubtracao() {
        resultadoSubtracao = (numeroUm - numeroDois);
        return resultadoSubtracao;
    }

    public double calcularmultiplicacao() {
        resultadoMultiplicacao = (numeroUm * numeroDois);
        return resultadoMultiplicacao;
    }

    public double calcularDivisao() {
        resultadoDivisao = (numeroUm / numeroDois);
        return resultadoDivisao;
    } 

    public double calcularPotencia() {
        resultadoPotencia = Math.pow(numeroUm, numeroDois);
        return resultadoPotencia;
    }

    public double calcularRaizQuadrada() {
        resultadoRaizQuadrada = Math.sqrt(numeroUm);
        return resultadoRaizQuadrada;
    }

    public void setsairDaCalculadora(String sairCalculadora) {
        sairDaCalculadora = sairCalculadora;
    }

    public String getsairDaCalculadora() {
        return sairDaCalculadora;
    }
    
    public void setescolherOperacaoMatematica(byte escolhaDaOperacaoMatematica) {
        operacaoMatematica = escolhaDaOperacaoMatematica;
    }

    public Byte getescolherOperacaoMatematica() {
        return operacaoMatematica;
    }

    public double getresultadoSoma() {
        return resultadoSoma;
    }

    public double getresultadoSubtracao() {
        return resultadoSubtracao;
    }

    public double getresultadoMultiplicacao() {
        return resultadoMultiplicacao;
    }

    public double getresultadoDivisao() {
        return resultadoDivisao;
    }

    public double getresultadoPotencia() {
        return resultadoPotencia;
    }

    public double getresultadoRaizQuadrada() {
        return resultadoRaizQuadrada;
    }
}

