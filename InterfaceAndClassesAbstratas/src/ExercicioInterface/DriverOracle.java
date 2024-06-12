package ExercicioInterface;

public class DriverOracle implements InterfaceBD {
    @Override
    public void conectar(String servidor) {
        System.out.println("ORACLE> " + servidor + "Connected");
    }

    @Override
    public void executar(String SQL) {
        System.out.println("ORACLE> Executing " + SQL);
    }
}
