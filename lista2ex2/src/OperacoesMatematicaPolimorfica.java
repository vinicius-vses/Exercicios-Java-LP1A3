package lista2ex2;

import lista2ex2.src.Divisao;
import lista2ex2.src.Subtracao;

import java.util.Scanner;

public class OperacoesMatematicaPolimorfica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Numero 1: ");
        double n1 = Double.parseDouble(scanner.nextLine());

        System.out.println("Numero 2: ");
        double n2 = Double.parseDouble(scanner.nextLine());

        int opc;
        do {
            System.out.println("Escolha a operacao matematica: ");
            System.out.println("0 - Sair");
            System.out.println("1 - Soma");
            System.out.println("2 - Substracao");
            System.out.println("3 - Multiplicacao");
            System.out.println("4 - Divisao");
            opc = scanner.nextInt();

            Soma soma = new Soma(n1, n2);
            soma.setSoma(n1, n2);
            Subtracao subtracao = new Subtracao(n1, n2);
            subtracao.setSubstracao(n1, n2);
            Multiplicacao multiplicacao = new Multiplicacao(n1, n2);
            multiplicacao.setMultiplicacao(n1, n2);
            Divisao divisao = new Divisao(n1, n2);
            divisao.setDivisao(n1, n2);

            switch (opc) {
                case 1: {
                    System.out.println("Resultado da soma: " + soma.getSoma());
                    break;
                }
                case 2: {
                    System.out.println("Resultado da subtracao: " + subtracao.getSubstracao());
                    break;
                }
                case 3: {
                    System.out.println("Resultado da multiplicacao: " + multiplicacao.getMultiplicacao());
                    break;
                }
                case 4: {
                    System.out.println("Resultado da divisao: " + divisao.getDivisao());
                    break;
                }
                default:
                    if (opc != 0)
                        System.out.println("Opcao Invalida!");
                    else
                        System.out.println("Fim");
                    break;
            }
        } while (opc != 0);
        scanner.close();
    }
}