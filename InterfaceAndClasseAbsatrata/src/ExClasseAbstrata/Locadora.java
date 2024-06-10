package ExClasseAbstrata;

public class Locadora {
    public static void main(String[] args) {
        Veiculo estoque[];

        estoque = new Veiculo[5];

        estoque[0] = new Carro("Celta", "JDK-8123", 50);
        estoque[1] = new Moto("H2R", "BOI-8089", 90, 6);
        estoque[2] = new Quadriciclo("Polar GSRX", "abc-9999", 76, 400);
        estoque[3] = new Carro("McLaren P1", "KKK-4444", 200);
        estoque[4] = new Moto("Panigale", "OPA-8017", 50, 6);

        for (Veiculo v : estoque) {
            System.out.println("Veículo = " + v.getModelo() + " Aluguel = R$ " + v.calcularAluguel(7));
        }
    }
}

