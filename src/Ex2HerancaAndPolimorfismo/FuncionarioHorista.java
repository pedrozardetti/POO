package Ex2HerancaAndPolimorfismo;

public class FuncionarioHorista extends Funcionario{

    int horasTrabalhadas;
    double valorHora;

    public FuncionarioHorista(String nome, double salario, int horasTrabalhadas, double valorHora) {
        super(nome, salario);
        this.horasTrabalhadas = horasTrabalhadas;
        this.valorHora = valorHora;
    }

    @Override
    public double calcularPagamento() {
        return horasTrabalhadas * valorHora;
    }

}
