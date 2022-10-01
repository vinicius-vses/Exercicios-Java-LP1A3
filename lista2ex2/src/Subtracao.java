package lista2ex2.src;

public class Subtracao extends Operacao {
    double subtracao = 0;
    double n1 = 0;
    double n2 = 0;
    public Subtracao(double n1, double n2){
        this.n1 = n1;
        this.n2 = n2;
    }
    public void setSubstracao (double n1, double n2){
        this.subtracao = this.subtracao + n1 - n2;;
    }
    public double getSubstracao(){
        return this.subtracao;
    }

    @Override
    public double calcular(double n1, double n2) {
        return 0;
    }
}