package lista2ex0;

public class Main {
    public static void calcular(OperacaoMatematica om, int a, int b) {
        System.out.println("Calculos: " + om.calcular(a,b));
    }
    public static void main (String[] args) {
        calcular (new Soma(), 10, 10);
        calcular (new Subtracao(), 10, 10);
        calcular (new Multiplicacao(), 10, 10);
        calcular (new Divisao(), 10, 10);
    }
}