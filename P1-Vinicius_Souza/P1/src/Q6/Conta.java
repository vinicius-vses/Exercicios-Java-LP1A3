/*package Q6;

public class Conta {
    private double saldo;
    private double saque;
    private double deposito;

    public Conta(double saldo, double saque, double deposito) {
        this.saldo = saldo;
        this.saque = saque;
        this.deposito = deposito;
    }

    public double getSaque() {
        return saque;
    }

    public double getDeposito() {
        return deposito;
    }

    public double setSaque(double saque) throws SaqueNegativo {
        if (saque > saldo){
            throw new SaqueNegativo();
        }
        else
            return this.saque = saque;
    }

    public double setDeposito(double deposito) throws DepositoNegativo {
        if (deposito < 0){
            throw new DepositoNegativo();
        }
        else
            return deposito = deposito;
    }

    public Conta(double saldo) {
        this.saldo = saldo;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}*/
