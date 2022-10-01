package lista1;

public class Fornecedor extends Pessoa{
    private double valorCredito = 1000;
    private double valorDivida = 100;

    public double getValorCredito() {
        return valorCredito;
    }

    public void setValorCredito(double valorCredito) {
        this.valorCredito = valorCredito;
    }

    public double getValorDivida() {
        return valorDivida;
    }

    public void setValorDivida(double valorDivida) {
        this.valorDivida = valorDivida;
    }

    double obterSaldo(){
        double saldo = valorCredito - valorDivida;
        return saldo;
    }
}
