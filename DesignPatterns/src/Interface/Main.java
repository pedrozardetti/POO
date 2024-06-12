package Interface;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);

        CalcularFrete calcularFrete = new CBO();

        calcularFrete.calcularFrete(45.0);

        CalcularFrete calcularFrete2 = new XPTO();
        calcularFrete2.calcularFrete(32.0);


    }
}