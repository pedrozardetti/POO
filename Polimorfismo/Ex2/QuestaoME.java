package Polimorfismo.Ex2;

public class QuestaoME extends QuestaoSimples {
    private String alternativa1;
    private String alternativa2;
    private String alternativa3;
    private String alternativa4;

    public QuestaoME(String e, String r, String alternativa1, String alternativa2, String alternativa3, String alternativa4) {
        super(e, r);
        this.alternativa1 = alternativa1;
        this.alternativa2 = alternativa2;
        this.alternativa3 = alternativa3;
        this.alternativa4 = alternativa4;
    }

    public String aplicarQuestao() {
        return "P:" + super.enunciado + "\n" +
                " a) " + alternativa1 + "\n" +
                " b) " + alternativa2 + "\n" +
                " c) " + alternativa3 + "\n" +
                " d) " + alternativa4;

    }
}
