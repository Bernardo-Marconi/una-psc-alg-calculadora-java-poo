public class Calculadora {
    
    private double numeroUm;
    private double numeroDois;


    public double getNumeroUm() {
        return numeroUm;
    }

    public double getNumeroDois() {
        return numeroDois;
    }

    public void setNumeroUm(double novoValorNumeroUm) {
        numeroUm = novoValorNumeroUm;
    }

    public void setNumeroDois(double novoValorNumeroDois) {
        numeroDois = novoValorNumeroDois;
    }

    public double calcularAdicao() {
        return (numeroUm + numeroDois);
    }

    public double calcularSubtracao() {
        return (numeroUm - numeroDois);
    }

    public double calcularmultiplicacao() {
        return (numeroUm * numeroDois);
    }

    public double calcularDivisao() {
        return (numeroUm / numeroDois);
    } 

    public double calcularPotencia() {
        return Math.pow(numeroUm, numeroDois);
    }

    public double calcularRaizQuadrada() {
        return Math.sqrt(numeroUm);
    }
}

