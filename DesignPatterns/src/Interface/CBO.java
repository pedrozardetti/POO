package Interface;

public class CBO implements CalcularFrete{
    @Override
    public Double calcularFrete(double frete) {
        return frete * 0.50;
    }
}

