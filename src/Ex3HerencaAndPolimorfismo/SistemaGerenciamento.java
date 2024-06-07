package Ex3HerencaAndPolimorfismo;

import java.util.ArrayList;

public class SistemaGerenciamento {
    ArrayList<ItemBiblioteca> itensEmprestar = new ArrayList<>();


    public void emprestarItem(String categoria) {
        ItemBiblioteca itemBiblioteca = catchItemCategory(categoria);
        itensEmprestar.add(itemBiblioteca);
    }

    public void devolverItem(String categoria, String removerItem) {
        for (ItemBiblioteca item : itensEmprestar) {
            if (item.getTitulo().equalsIgnoreCase(removerItem)) {
                itensEmprestar.remove(item);
                return;
            }
        }
    }

    public void listarItensEmprestados() {
        System.out.println("Listando todos os itens");
        for (ItemBiblioteca item : itensEmprestar) {
            System.out.println(item.toString());
        }
    }

    private ItemBiblioteca catchItemCategory(String categoria) {
        ItemBiblioteca item;
        if (categoria.equalsIgnoreCase("DVD")) {
            item = new DVD("A culpa eh das estrelas", 2024, "J.K Rowling", 66);
        } else if (categoria.equalsIgnoreCase("Revista")) {
            item = new Revista("National Geographic", 2024, 2024, "Março");
        } else if (categoria.equalsIgnoreCase("Livro")) {
            item = new Livro("O Senhor dos Anéis", 1954, 225, "Santos Dummond");
        } else {
            item = null; // Categoria não reconhecida
        }
        return item;
    }
}
