/*package Q3;

public class Quadrado extends Retangulo {

    private double largura;
    private double altura;
    private double perimetro;
    private double area;

    public Quadrado(double largura, double altura, double perimetro, double area){
        this.altura = altura;
        this.largura = largura;
        this.perimetro = perimetro;
        this.area = area;
    }
// validacao do quadrado é na classe avalia?
    @Override
    public double getLargura() {
        return largura;
    }

    @Override
    public void setLargura(double largura) {
        this.largura = largura;
    }

    @Override
    public double getAltura() {
        return altura;
    }

    @Override
    public void setAltura(double altura) {
        this.altura = altura;
    }
    private double setPerimetro(double perimetro) {
        setPerimetro (2 * (altura + largura));
        return perimetro;
    }

    public double getPerimetro() {
        System.out.println("Perimetro = " +getPerimetro());
        return perimetro;
    }

    public double getArea() {
        System.out.println("Area = " +getArea());
        return area;
    }

    public void setArea(double area) {
        setArea(altura * largura);
        this.area = area;
    }
}*/