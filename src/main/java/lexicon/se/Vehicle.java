package lexicon.se;

import java.util.Objects;

public abstract class Vehicle extends Object {
    private int vehicleId;
    private String registrationNumber;
    private String brand;

    public Vehicle() {
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    public abstract void derive();

    public Vehicle(int vehicleId, String registrationNumber, String brand) {
        this.vehicleId = vehicleId;
        this.registrationNumber = registrationNumber;
        this.brand = brand;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "vehicleId=" + vehicleId +
                ", registrationNumber='" + registrationNumber + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
