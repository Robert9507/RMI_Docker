import java.rmi.RemoteException;
import java.rmi.server.UnicastRemoteObject;
public class SaludoRemotoImplp extends  UnicastRemoteObject implements SaludoRemoto {
    public SaludoRemotoImplp() throws RemoteException  {
        super();
    }
    public String saludar(String nombre) throws RemoteException {
        return "¡Hola, " + nombre + " desde el servidor remoto!";
    }
}
