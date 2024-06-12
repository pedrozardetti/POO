package ExercicioInterface;

public class DriverMySQL implements InterfaceBD {

    @Override
    public void conectar(String servidor) {
        System.out.println("MYSQL> CONNECTING ON " + servidor);
    }

    @Override
    public void executar(String SQL) {
        System.out.println("MYSQL> " + SQL + "executed");
    }
}
