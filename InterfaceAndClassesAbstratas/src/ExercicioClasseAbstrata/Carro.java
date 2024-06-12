package ExercicioClasseAbstrata;

public class Carro extends Veiculo {
    public Carro(String modelo, String placa, float valorDiaria) {
        super(modelo, placa, valorDiaria);
    }

    public float calcularAluguel(int qtdDeDias) {
        return qtdDeDias * super.getValorDiaria();
    }
}


