import java.io.Serializable;

public class Car implements Serializable {
    private String model;
    private String color;
    private double mileage;
    private int plate;

    public Car(String model, String color, double mileage) {
        this.model = model;
        this.color = color;
        this.mileage = mileage;
        this.plate = -1;
    }

    public Car(Car one) {
        this.model = one.model;
        this.color = one.color;
        this.plate = one.plate;
        this.mileage = one.mileage;
    }

    public void setPlate(int plate) {
        this.plate = plate;
    }

    @Override
    public String toString() {
        if (plate == -1) {
            return "Model: " + model + " Color: " + color + " Mileage: " + mileage + " Unregistered plate";
        }
        return "Model: " + model + " Color: " + color + " Mileage: " + mileage + " Plate No: #" + plate;
    }
}
