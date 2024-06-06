package Ex3HerencaAndPolimorfismo;

import java.util.Scanner;

public class Main {
    public static SistemaGerenciamento sys = new SistemaGerenciamento();
    public static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {

        int opcao = 0;

        do {

            System.out.println("-- BEM VINDO AO SISTEMA --");
            System.out.println("1. Adicionar item");
            System.out.println("2. Remover item");
            System.out.println("3. Listar items");
            opcao = sc.nextInt();


            switch (opcao) {
                case 1:
                    System.out.println("Informe a categoria do item");
                    sc.nextLine();
                    String categoria = sc.nextLine();

                    sys.emprestarItem(categoria);
                    break;

                case 2:
                    System.out.println("Qual categoria de item você gostaria de remover?");
                    sc.nextLine();
                    String removerCategoria = sc.nextLine();

                    System.out.println("Qual nome do item que você deseja remover?");
                    String removerItem = sc.nextLine();
                    sys.devolverItem(removerCategoria, removerItem);
                    break;

                case 3:
                    sys.listarItensEmprestados();
                    break;
            }
        } while (opcao != 0);
        System.out.println("Você saiu do nosso programa :(");


    }
}
