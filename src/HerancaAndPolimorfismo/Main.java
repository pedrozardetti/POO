package HerancaAndPolimorfismo;

public class Main {

    public static void main(String[] args) {

        System.out.println("Informações do paciente");

        // Pessoa paciente é um upcasting
        Pessoa paciente = new Paciente("1234", "Sulamerica", "Pedro", 25, "19677696807");
        paciente.imprimirInfo(); // As informações ao fazer paciente. são nativas da classe pai (Pessoa)

        System.out.println("Informações do enfermeiro");

        Pessoa enfermeiro = new Enfermeiro(12, "UTI", "123456", "Gabriel", 20, "12244435");
        enfermeiro.imprimirInfo();
    }

}
