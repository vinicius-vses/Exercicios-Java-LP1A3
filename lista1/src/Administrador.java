package lista1;

public class Administrador extends Empregado {
    private int ajudaDeCusto = 300;

    @Override
    double calcularSalario() {
        return super.calcularSalario();
    }

    int salarioAdmin(){
        int salario = getSalarioBase() + ajudaDeCusto;
        return salario;
    }
}
