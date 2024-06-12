public class Locadora {
    public static void main(String[] args) {
        Veiculo estoque[];

        estoque = new Veiculo[5];

        estoque[0] = new Carro("Celta", "JDK-8123", 50.0F);
        estoque[1] = new Moto("H2R", "BOI-8089", 90.0F, 6.0F);
        estoque[2] = new Quadriciclo("Polar GSRX", "abc-9999", 76.0F, 400.0F);
        estoque[3] = new Carro("McLaren P1", "KKK-4444", 200.0F);
        estoque[4] = new Moto("Panigale", "OPA-8017", 50.0F, 6.0F);

        for (Veiculo v : estoque) {
            System.out.println("Veículo -> " + v.getModelo() + " Aluguel = R$ " + v.calcularAluguel(7));
        }


    }
}


