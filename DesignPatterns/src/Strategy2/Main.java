package Strategy2;

import Interface.CalcularFrete;

public class Main {
    public static void main(String[] args) {


        ListaEmpresas listaEmpresas = ListaEmpresas.CBO;

        listaEmpresas.calcularFrete(43);

        System.out.println(listaEmpresas.values()[0].calcularFrete(54));

    }
}
