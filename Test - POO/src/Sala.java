
public class Sala {

    private PortaSala portaEntrada;
    private float metragemQuadrada;
    private Porta portaAuxiliar;

    public void metragemQuadrada() {
        System.out.println("A sala tem " + metragemQuadrada + " metros quadrados");
    }

    public void portaEntrada() {
        System.out.println("A porta de entrada da sala é: " + portaEntrada);
    }

    public void portaAuxiliar() {
        System.out.println("A porta auxiliar está aberta");
    }

    public PortaSala getPortaEntrada() {
        return portaEntrada;
    }

    public void setPortaEntrada(PortaSala portaEntrada) {
        this.portaEntrada = portaEntrada;
    }

    public float getMetragemQuadrada() {
        return metragemQuadrada;
    }

    public void setMetragemQuadrada(float metragemQuadrada) {
        this.metragemQuadrada = metragemQuadrada;
    }

    public Porta getPortaAuxiliar() {
        return portaAuxiliar;
    }

    public void setPortaAuxiliar(Porta portaAuxiliar) {
        this.portaAuxiliar = portaAuxiliar;
    }
}
