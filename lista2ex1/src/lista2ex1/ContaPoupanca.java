package lista2ex1;

public class ContaPoupanca extends ContaBancaria{

    int senha;
    private int numero;
    private double saldo;
    private double taxaRend;

    protected ContaPoupanca() {
        alteraSenha();
        Sacar();
        Deposita();
        TiraExtrato();
    }

    @Override
    public double Sacar() {
        return this.saldo - 100;
    }

    @Override
    public double Deposita() {
        return this.saldo + 100;
    }

    @Override
    public void TiraExtrato() {
        System.out.println("Extrato: "+saldo);
    }
    ContaPoupanca(int senha) {
        super(senha);
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public double getTaxaRend() {
        return taxaRend;
    }

    public void setTaxaRend(double taxaRend) {
        this.taxaRend = taxaRend;
    }

}
