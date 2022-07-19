package lexicon.se;

public class Motorcycle extends Vehicle {

    private Double fuelConsumption;
    private int maxSpeed;
    private String type;

    public Motorcycle(Double fuelConsumption, int maxSpeed, String type) {
        this.fuelConsumption = fuelConsumption;
        this.maxSpeed = maxSpeed;
        this.type = type;
    }

    @Override
    public void derive() {
        System.out.println(type+" is a "+fuelConsumption+"and consumes"+fuelConsumption);

    }
}
