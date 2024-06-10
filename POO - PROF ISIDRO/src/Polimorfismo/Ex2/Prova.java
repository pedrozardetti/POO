package Polimorfismo.Ex2;

import java.util.Scanner;

public class Prova {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        QuestaoSimples perguntas[];
        perguntas = new QuestaoSimples[5];

        perguntas[0] = new QuestaoSimples("Quem descobriu o Brasa?", "PA Cabral");
        perguntas[1] = new QuestaoME("Qual a cor do cavalo branco do Napoleão?", "a", "branco", "marrom", "preto", "malhado");
        perguntas[2] = new QuestaoComDica("Qual a linguagem do curso?", "Java", "Inicia com J e termina com A");
        perguntas[3] = new QuestaoSimples("Qual a fórmula da água", "H2O");
        perguntas[4] = new QuestaoME("Qual jogo favorito do Isidro?", "c", "Mario", "Zelda", "Megaman", "Street Fighter");

        int pontos = 0;

        System.out.println("****  Prova do Isidro ****");
        for (int i = 0; i < perguntas.length; i++) {
            System.out.println(perguntas[i].aplicarQuestao());
            System.out.println("Sua resposta:");
            String resp = teclado.nextLine();
            if (perguntas[i].corrigir(resp)) {
                pontos += 2;
            }

        }
        System.out.println("Sua nota final vale -> " + pontos);

    }
}
