package ExercicioClasseAbstrata;

public abstract class Veiculo {
    private String modelo;
    private String placa;
    private float valorDiaria;

    public Veiculo(String modelo, String placa, float valorDiaria) {
        this.modelo = modelo;
        this.placa = placa;
        this.valorDiaria = valorDiaria;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public float getValorDiaria() {
        return this.valorDiaria;
    }

    public void setValorDiaria(float valorDiaria) {
        this.valorDiaria = valorDiaria;
    }

    public String getPlaca() {
        return this.placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public abstract float calcularAluguel(int qtdeDias);
}

