package ExInterface;

public class AppBancoDados {

    public static void main(String[] args) {
        InterfaceBD x;
        if (args[0].equals("mysql")) {
            x = new DriverMySQL();
        } else {
            x = new DriverOracle();
        }
        x.executar("localhost");
        x.executar("Select * from tabela");
    }
}
