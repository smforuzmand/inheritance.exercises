package lexicon.se;

public class Motorcycle extends Vehicle {

    private Double fuelConsumption;
    private int maxSpeed;
    private String type;



    public Motorcycle(int vehicleId, String registrationNumber, String brand, Double fuelConsumption, int maxSpeed, String type) {
        super(vehicleId, registrationNumber, brand);
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    @Override
    public void derive() {
        System.out.println("youngsters like to ride them with maxSpeed of "+maxSpeed);

    }

    @Override
    public String toString() {
        return "Motorcycle{" +
                "fuelConsumption=" + fuelConsumption +
                ", maxSpeed=" + maxSpeed +
                ", type='" + type + '\'' +
                '}';
    }
}
