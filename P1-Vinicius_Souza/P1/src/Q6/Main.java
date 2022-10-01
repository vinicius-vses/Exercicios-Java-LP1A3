/*package Q6;

public class Main {
    public static void main(String[] args) throws DepositoNegativo {
        Conta conta = new Conta(9,0,0);

        System.out.println("Saldo: "+conta.getSaldo());
        System.out.println("Deposito: "+conta.getDeposito());
        System.out.println("Saque: "+conta.getSaque());

        try{
            System.out.println(""+conta.setDeposito(-10));
        }
        catch (DepositoNegativo e) {
            System.out.println(""+e.mensagemDeposito);
        }

        try{
            System.out.println(""+conta.setSaque(10));
        }
        catch (SaqueNegativo e) {
            System.out.println(""+e.mensagemSaque);
        }
    }
}*/