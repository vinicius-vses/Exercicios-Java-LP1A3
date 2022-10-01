public class TrataExcecao {

    public static void main(String[] args) {

        //boolean continueLoop = true;

        //do {
            try {
                int vetor[] = new int[100];
                vetor[100] = 1;
                System.out.println("Dentro do bloco try...");
                //continueLoop = false;

            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Ocorreu a excecao: " + e);
            }

        System.out.println("Após o tratamento de excecoes...");
        //} while (continueLoop);
    }
}