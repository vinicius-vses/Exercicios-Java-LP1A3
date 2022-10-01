package lista2ex1;

public class ContaCorrente extends ContaBancaria{

    int senha;
    private int numero;
    private double saldo;
    private double qtdTransacoes;

    protected ContaCorrente() {
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
        System.out.println("Extrato: ");
    }
    ContaCorrente(int senha) {
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

    public double getQtdTransacoes() {
        return qtdTransacoes;
    }

    public void setQtdTransacoes(double qtdTransacoes) {
        this.qtdTransacoes = qtdTransacoes;
    }

}
