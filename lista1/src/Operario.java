package lista1;

public class Operario extends Empregado {
    private int valorProducao = 130;
    private float comissao = 10;

    @Override
    double calcularSalario(){
        double salario = ((100 + comissao) / 100) * getSalarioBase();
        return salario;
    }
}