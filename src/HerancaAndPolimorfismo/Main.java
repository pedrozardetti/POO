package HerancaAndPolimorfismo;

public class Main {

    public static void main(String[] args) {

        Paciente paciente = new Paciente("1234", "Sulamerica", "Pedro", 25, "19677696807");
        paciente.imprimirInfo(); // As informações ao fazer paciente. são nativas da classe pai (Pessoa)

    }

}
