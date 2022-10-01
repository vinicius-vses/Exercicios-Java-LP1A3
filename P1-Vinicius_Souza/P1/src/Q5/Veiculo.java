package Q5;

public abstract class Veiculo {
    Carro car = new Carro ();
    Moto moto = new Moto ();
    private String placa;
    private int combustivelNoTanque = 100;
    private int quilometragem;
    private boolean alugado;
    private double precoDiaria;


    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getCombustivelNoTanque() {
        return combustivelNoTanque;
    }

    public void setCombustivelNoTanque(int combustivelNoTanque) {
        this.combustivelNoTanque = combustivelNoTanque;
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public boolean isAlugado() {
        return alugado;
    }

    public void setAlugado(boolean alugado) {
        this.alugado = alugado;
    }

    public double getPrecoDiaria() {
        return precoDiaria;
    }

    public void setPrecoDiaria(double precoDiaria) {
        this.precoDiaria = precoDiaria;
    }

    public Veiculo(String placa, int combustivelNoTanque, int quilometragem,
                   boolean alugado, double precoDiaria) {
        this.placa = placa;
        this.combustivelNoTanque = combustivelNoTanque;
        this.quilometragem = quilometragem;
        this.alugado = alugado;
        this.precoDiaria = precoDiaria;
    }

    public String toString (String s){
        return null;
    }

    public boolean equals(Veiculo veiculo) {
        placa = placa;
        return true;
    }
}
