package lista1;

public class Main {

    public static void main(String[] args) {
        //Pessoa p = new Pessoa();
        Fornecedor f = new Fornecedor();
        Empregado e = new Empregado();
        Administrador a = new Administrador();
        Operario o = new Operario();
        Vendedor v = new Vendedor();

        System.out.println(f.getNome());
        System.out.println(f.getTelefone());
        System.out.println(f.getEndereco());
        System.out.println(f.getValorCredito());
        System.out.println(f.getValorDivida());
        System.out.println(f.obterSaldo());
        System.out.println(e.getCodigoSetor());
        System.out.println(e.getSalarioBase());
        System.out.println(e.calcularSalario());
        System.out.println(a.salarioAdmin());
        System.out.println(o.calcularSalario());
        System.out.println(v.calcularSalario());
    }
}