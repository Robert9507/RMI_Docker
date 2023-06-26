import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ServidorRMI {
    public static void main(String[] args) {
        try {
            SaludoRemotoImplp obj = new SaludoRemotoImplp();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.bind("SaludoRemoto", obj);
            System.out.println("Servidor RMI listo.");
        } catch (Exception e) {
            System.err.println("Error en el servidor: " + e.toString());
            e.printStackTrace();
        }
    }
}
