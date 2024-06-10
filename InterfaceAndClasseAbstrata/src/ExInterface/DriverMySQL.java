package ExInterface;

public class DriverMySQL implements InterfaceBD{
    @Override
    public void conectar(String servidor) {
        System.out.println("MYSQL> Connecting on "+servidor);
    }

    @Override
    public void executar(String SQL) {
        System.out.println("MYSQL> " +SQL+ "executed");
    }
}
