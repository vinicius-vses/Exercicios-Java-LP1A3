package lista2ex1;

public class Main {
    public static void main(String[] args) {

        ContaBancaria cc = new ContaCorrente(123456) {
        ContaBancaria cp = new ContaPoupanca(123456) {

            @Override
            public double Sacar() {
                return 0;
            }

            @Override
            public double Deposita() {
                return 0;
            }

            @Override
            public void TiraExtrato() {

            }
        };
        };
    }
}