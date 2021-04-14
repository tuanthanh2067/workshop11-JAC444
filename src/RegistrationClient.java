import java.net.MalformedURLException;
import java.rmi.Naming;
import java.rmi.NotBoundException;
import java.rmi.RemoteException;

public class RegistrationClient {
    public static void main(String[] args) {
        try {
            CalculatePlate c = (CalculatePlate) Naming.lookup("rmi://localhost:1099/RegistrationService");

            Car car = new Car("Vinfast VF33", "Black", 200);
            System.out.println(car);

            car = c.calculatePlate(car);
            System.out.println(car);

        } catch (MalformedURLException murle) {
            System.out.println("MalformedURLException");
            System.out.println(murle);
        } catch (RemoteException re) {
            System.out.println("RemoteException");
            System.out.println(re);
        } catch (NotBoundException nbe) {
            System.out.println("NotBoundException");
            System.out.println(nbe);
        } catch (ArithmeticException ae) {
            System.out.println("ArithmeticException");
            System.out.println(ae);
        }
    }
}
