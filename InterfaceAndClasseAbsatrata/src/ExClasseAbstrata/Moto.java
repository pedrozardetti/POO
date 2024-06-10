public class Moto extends Veiculo {
    private float fatorDesconto;

    public Moto(String modelo, String placa, float valorDiaria, float fatorDesconto) {
        super(modelo, placa, valorDiaria);
        this.fatorDesconto = fatorDesconto;
    }

    @Override
    public float calcularAluguel(int qtdDeDias) {
        return super.getValorDiaria() * qtdDeDias - (super.getValorDiaria()+qtdDeDias);
    }
}
