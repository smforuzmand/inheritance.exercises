package lexicon.se;

public class Car extends Vehicle {

    private int numberOfDoors;
    private int numberOfPassengers;
    private String name;

    public Car(int numberOfDoors, int numberOfPassengers, String name) {
        super();
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
        this.name = name;
    }

    @Override
    public void derive() {
        System.out.println(name + " has" + numberOfDoors + " the capacity of" + numberOfPassengers);
    }
}
