package ExercicioInterface2;

public class Circulo implements FormaGeometrica, Impressao {

    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    public double getRaio() {
        return raio;
    }

    public void setRaio(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return Math.PI * (raio * raio);
    }

    @Override
    public double comprimento() {
        return 2 * Math.PI * raio;
    }

    @Override
    public void imprimeDados() {
        System.out.println("A área do círculo é -> " + area());
        System.out.println("O comprimento do círculo é -> " + comprimento());
    }
}

