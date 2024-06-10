package ExClasseAbstrata;

public class Carro extends Veiculo{

    public Carro(String modelo, String placa, float valorDiaria) {
        super(modelo, placa, valorDiaria);
    }

    @Override
    public float calcularAluguel(int qtdDeDias) {
        return qtdDeDias * super.getValorDiaria();
    }
}
