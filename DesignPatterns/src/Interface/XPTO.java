package Interface;

public class XPTO implements CalcularFrete {

    @Override
    public Double calcularFrete(double frete) {
        return frete * 0.15;
    }
}
