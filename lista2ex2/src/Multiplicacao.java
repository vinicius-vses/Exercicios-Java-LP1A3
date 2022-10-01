package lista2ex2;

import lista2ex2.src.Operacao;

public class Multiplicacao extends Operacao {
    double multiplicacao = 0;
    double n1 = 0;
    double n2 = 0;
    public Multiplicacao(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void setMultiplicacao (double n1, double n2){
        this.multiplicacao = this.multiplicacao + n1 * n2;
    }
    public double getMultiplicacao(){
        return this.multiplicacao;
    }
    @Override
    public double calcular(double n1, double n2) {
        return n1 * n2;
    }
}


