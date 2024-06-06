package HerancaAndPolimorfismo;

public class Paciente extends Pessoa { //Extends serve para HERDAR os atributos & métodos da classe pai (Pessoa)

    String matricula;
    String planoDeSaude;

    public Paciente(String matricula, String planoDeSaude, String nome, int idade, String documento) {
        super(nome, idade, documento); //Super refere-se quando estamos chamando o construtor da classe pai (Pessoa).
        this.matricula = matricula;
        this.planoDeSaude = planoDeSaude;
    }

    @Override
    public void imprimirInfo() {
        super.imprimirInfo();
        System.out.println("Matrícula: " + this.matricula);
        System.out.println("Plano de Saúde: " + this.planoDeSaude);
    }

}
