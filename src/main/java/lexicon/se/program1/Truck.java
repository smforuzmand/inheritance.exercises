package lexicon.se.program1;

import lexicon.se.program1.Vehicle;

public class Truck extends Vehicle {

    private double maxWeight;
    private int wheels;
    private String fuelType;

    public Truck(int vehicleId, String registrationNumber, String brand, double maxWeight, int wheels, String fuelType) {
        super(vehicleId, registrationNumber, brand);
        this.maxWeight = maxWeight;
        this.wheels = wheels;
        this.fuelType = fuelType;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "maxWeight=" + maxWeight +
                ", wheels=" + wheels +
                ", fuelType='" + fuelType + '\'' +
                '}';
    }

    @Override
    public void derive() {
        System.out.println("Truck is  a heavy duty vehicle ");
    }
}
