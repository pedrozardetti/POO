package Ex1Heranca;

public class Veiculo {

    String marca;
    String modelo;
    int ano;

    public Veiculo() {
    }

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public void imprimirInfo() {

        System.out.println("Nome da Marca: " + this.marca);
        System.out.println("Nome do Modelo: " + this.modelo);
        System.out.println("Ano do veículo: " + this.ano);
    }


}

