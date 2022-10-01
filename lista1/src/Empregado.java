package lista1;

public class Empregado extends Pessoa {

    private int codigoSetor = 77;
    private int salarioBase = 1200;
    private float imposto = 10;

    public int getCodigoSetor() {
        return codigoSetor;
    }

    public void setCodigoSetor(int codigoSetor) {
        this.codigoSetor = codigoSetor;
    }

    public int getSalarioBase() {
        return salarioBase;
    }

    public void setSalarioBase(int salarioBase) {
        this.salarioBase = salarioBase;
    }

    public double getImposto() {
        return imposto;
    }

    public void setImposto(int imposto) {
        this.imposto = imposto;
    }

    double calcularSalario(){
        double salario = ((100 - imposto) / 100) * salarioBase;
        return salario;
    }
}
