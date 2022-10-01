package lista2ex2.src;

public class Divisao extends Operacao {
    double divisao = 0;
    double n1 = 0;
    double n2 = 0;
    public Divisao(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void setDivisao (double n1, double n2){
        this.divisao = this.divisao + n1 / n2;
    }
    public double getDivisao(){
        return this.divisao;
    }

    @Override
    public double calcular(double n1, double n2) {
        return n1 / n2;
    }
}

