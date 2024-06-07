package Ex3HerencaAndPolimorfismo;

public class Livro extends ItemBiblioteca {

    int numeroPaginas;
    String autor;


    public Livro(String titulo, int anoPublicacao, int numeroPaginas, String autor) {
        super(titulo, anoPublicacao);
        this.numeroPaginas = numeroPaginas;
        this.autor = autor;
    }

    public int getNumeroPaginas() {
        return numeroPaginas;
    }

    public void setNumeroPaginas(int numeroPaginas) {
        this.numeroPaginas = numeroPaginas;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "numeroPaginas=" + numeroPaginas +
                ", autor='" + autor + '\'' +
                ", titulo='" + titulo + '\'' +
                ", anoPublicacao=" + anoPublicacao +
                '}';
    }

    @Override
    public void imprimirInfo() {

    }
}
