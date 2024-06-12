package ExercicioInterface1;

import java.util.Scanner;

public class Menu {

    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        do {
            System.out.println("-- ESCOLHA A OPÇÃO --");
            System.out.println("1. Calcular área e comprimento do círculo");
            System.out.println("2. Calcular área e comprimento do quadrado");
            System.out.println("0. Sair");
            opcao = sc.nextInt();
            sc.nextLine();

            switch (opcao) {
                case 1:
                    System.out.println("Informe o raio do círculo");
                    double raio = sc.nextDouble();

                    Circulo circ = new Circulo(raio);
                    System.out.println("A área do círculo é -> " + circ.area());
                    System.out.println("O comprimento do círculo é -> " + circ.comprimento());
                    break;
                case 2:
                    System.out.println("Informe o lado do quadrado");
                    double lado = sc.nextDouble();

                    Quadrado quad = new Quadrado(lado);
                    System.out.println("A área do quadrado é -> " + quad.area());
                    System.out.println("O comprimento do quadrado é -> " + quad.comprimento());
                    break;
            }

        } while (opcao != 0);
        System.out.println("Você saiu!");


    }

}
