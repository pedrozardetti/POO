package Ex2HerancaAndPolimorfismo;

public class FuncionarioComissionado extends Funcionario {

    double vendas;
    double taxaComissao;


    public FuncionarioComissionado(String nome, double salario, double vendas, double taxaComissao) {
        super(nome, salario);
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularPagamento() {
        return salario + (vendas * taxaComissao);
    }

}
