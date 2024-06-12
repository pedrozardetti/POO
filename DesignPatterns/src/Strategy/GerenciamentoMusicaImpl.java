package Strategy;

import java.util.ArrayList;

public class GerenciamentoMusicaImpl implements GerenciamentoMusica, Teste2 {

    ArrayList<String> gerenciamento = new ArrayList<>();

    @Override
    public void adicionar(String nome) {
        gerenciamento.add(nome);
    }

    @Override
    public void remover(Integer id) {
        gerenciamento.remove(id);
    }

    @Override
    public void alterar(Integer id, String nome) {
        gerenciamento.set(id, nome);
    }

    @Override
    public void listar() {
        gerenciamento.forEach(musica -> {
            System.out.println(musica);
        });
    }

    @Override
    public void print() {

    }
}
