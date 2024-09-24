public class Porta {

    private String cor;
    private float largura;
    private float altura;
    private double peso;
    
    public void abrir() {
        System.out.println("Porta aberta");
    }

    public void fechar() {
        System.out.println("Porta fechada");
    }

    public void cor() {
        System.out.println("A cor da porta é: " + cor);
    }

    public void largura() {
        System.out.println("A largura da porta é: " + largura + " metros");
    }

    public void altura() {
        System.out.println("A altura da porta é: " + altura + " metros");
    }

    public void peso() {
        System.out.println("O peso da porta é: " + peso + " kg");
    }
    


}
