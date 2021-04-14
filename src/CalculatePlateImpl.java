public class CalculatePlateImpl extends java.rmi.server.UnicastRemoteObject implements CalculatePlate {
    public CalculatePlateImpl() throws java.rmi.RemoteException {
        super();
    }

    public Car calculatePlate(Car car) throws java.rmi.RemoteException {
        car.setPlate(hashCode());
        return car;
    }

}
