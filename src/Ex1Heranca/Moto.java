package Ex1Heranca;

public class Moto extends Veiculo {

    int cilindrada;

    public Moto(String marca, String modelo, int ano, int cilindrada) {
        super(marca, modelo, ano);
        this.cilindrada = cilindrada;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Cilindrada da moto: " + this.cilindrada);
    }

}
