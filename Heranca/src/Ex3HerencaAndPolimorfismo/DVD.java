package Ex3HerencaAndPolimorfismo;

public class DVD extends ItemBiblioteca {

    String diretor;
    int duracao;


    public DVD(String titulo, int anoPublicacao, String diretor, int duracao) {
        super(titulo, anoPublicacao);
        this.diretor = diretor;
        this.duracao = duracao;
    }

    public String getDiretor() {
        return diretor;
    }

    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }

    public int getDuracao() {
        return duracao;
    }

    public void setDuracao(int duracao) {
        this.duracao = duracao;
    }

    @Override
    public String toString() {
        return "DVD{" +
                "diretor='" + diretor + '\'' +
                ", duracao=" + duracao +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

    public void imprimirInfo() {

    }
}
