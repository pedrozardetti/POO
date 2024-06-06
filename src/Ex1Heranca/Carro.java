package Ex1Heranca;

public class Carro extends Veiculo {

    int numeroDePortas;


    public Carro(String marca, String modelo, int ano, int numeroDePortas) {
        super(marca, modelo, ano);
        this.numeroDePortas = numeroDePortas;
    }

    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("O número de portas do carro é " + numeroDePortas);
    }

}
