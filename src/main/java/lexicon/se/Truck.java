package lexicon.se;

public class Truck extends Vehicle {

    private double maxWeight;
    private int wheels;
    private String fuelType;

    public Truck(double maxWeight, int wheels, String fuelType) {
        this.maxWeight = maxWeight;
        this.wheels = wheels;
        this.fuelType = fuelType;
    }

    @Override
    public void derive() {
        System.out.println("Truck is  a heavy duty vehicle ");
    }
}
