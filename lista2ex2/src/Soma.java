package lista2ex2.src;
public class Soma extends Operacao{
    double soma = 0;
    double n1 = 0;
    double n2 = 0;
    public Soma(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void setSoma (double n1, double n2){
        this.soma = this.soma + n1 + n2;
    }
    public double getSoma(){
        return this.soma;
    }

    @Override
    public double calcular(double n1, double n2) {
        return 0;
    }
}