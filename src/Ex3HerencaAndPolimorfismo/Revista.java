package Ex3HerencaAndPolimorfismo;

public class Revista extends ItemBiblioteca {

    int edicao;
    String mesPublicacao;


    public Revista(String titulo, int anoPublicacao, int edicao, String mesPublicacao) {
        super(titulo, anoPublicacao);
        this.edicao = edicao;
        this.mesPublicacao = mesPublicacao;
    }


    public int getEdicao() {
        return edicao;
    }

    public void setEdicao(int edicao) {
        this.edicao = edicao;
    }

    public String getMesPublicacao() {
        return mesPublicacao;
    }

    public void setMesPublicacao(String mesPublicacao) {
        this.mesPublicacao = mesPublicacao;
    }

    @Override
    public String toString() {
        return "Revista{" +
                "edicao=" + edicao +
                ", mesPublicacao='" + mesPublicacao + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

    public void imprimirInfo() {

    }


}
