package ExercicioInterface3;

public class Multiplicacao implements OperacaoMatematica, Impressao {

    private int a;
    private int b;

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public Multiplicacao(int a, int b) {
        this.a = a;
        this.b = b;
    }

    @Override
    public int calcula(int a, int b) {
        return a * b;


    }

    @Override
    public void imprimeDados() {
        System.out.println("O resultado da conta foi -> " + calcula(a, b));
    }
}
