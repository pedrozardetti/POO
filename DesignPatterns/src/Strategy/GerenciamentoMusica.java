package Strategy;

public interface GerenciamentoMusica {

    void adicionar(String nome);

    void remover(Integer id);

    void alterar(Integer id, String nome);

    void listar();

}
