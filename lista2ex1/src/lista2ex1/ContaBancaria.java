package lista2ex1;

import java.util.Scanner;

public abstract class ContaBancaria {
    Scanner scan = new Scanner(System.in);
    int senha;

    protected ContaBancaria() {
    }

    public abstract double Sacar();

    public abstract double Deposita();

    public abstract void TiraExtrato();
    ContaBancaria(int senha)
    {
        this.senha = senha;
    }

    void alteraSenha(){

        System.out.print("Digite a senha atual: ");
        senha = scan.nextInt();

        if (senha == 123456) {
            System.out.println("Digite a nova senha: ");
            senha = scan.nextInt();

        }else{
                System.out.println("Senha incorreta. Nao foi possivel alterar a senha.");
            }
        }
}

