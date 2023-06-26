import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Scanner;

public class ClienteRMI {
    public static void main(String[] args) {
        try {
            Registry registry = LocateRegistry.getRegistry("localhost", 1099);
            SaludoRemoto stub = (SaludoRemoto) registry.lookup("SaludoRemoto");

            Scanner scanner = new Scanner(System.in);
            System.out.print("Ingrese su nombre: ");
            String nombre = scanner.nextLine();

            String saludo = stub.saludar(nombre);
            System.out.println("Respuesta del servidor: " + saludo);
        } catch (Exception e) {
            System.err.println("Error en el cliente: " + e.toString());
            e.printStackTrace();
        }
    }
}
