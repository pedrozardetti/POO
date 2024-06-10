package Polimorfismo.Ex1;

import Polimorfismo.Ex1.Cliente;
import Polimorfismo.Ex1.ClienteVIP;

public class LojasPI {

    public static void main(String[] args) {
        // A instância de c1 é Cliente e a instância de c2 é ClienteVIP
        Cliente c1, c2; // c1 e c2 são referencias à cliente.

        c1 = new Cliente("Isidro", "isidro@gmail.com", 500);
        c2 = new ClienteVIP("Pedro", "pedrozardetti1@gmail.com", 500, 300);

        System.out.println(c1);
        System.out.println(c2);

        if (c2.fazerCompra(650)) {
            System.out.println("Conseguiu comprar");
        } else {
            System.out.println("Saldo insuficiente");
        }
        System.out.println(c2);

    }

}
