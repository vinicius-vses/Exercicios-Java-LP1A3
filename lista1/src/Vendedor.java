package lista1;

public class Vendedor extends Empregado{
    private int valorMonetario  = 140;
    private float comissao = 10;

    @Override
    double calcularSalario(){
        double salario = ((100 + comissao) / 100) * getSalarioBase();
        return salario;
    }
}
