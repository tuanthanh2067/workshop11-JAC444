import java.rmi.RemoteException;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class RegistrationServer {

    public RegistrationServer() {
        try {
            CalculatePlate obj = new CalculatePlateImpl();
            Registry registry = LocateRegistry.createRegistry(1099);
            registry.rebind("RegistrationService", obj);

            System.out.println("RegistrationService bound in registry");

        } catch (RemoteException e) {
            System.err.println("Error: " + e);
            System.exit(1);
        }
    }

    public static void main(String arg[]) {
        new RegistrationServer();
        System.out.println("Registration Server is running");
    }
}
