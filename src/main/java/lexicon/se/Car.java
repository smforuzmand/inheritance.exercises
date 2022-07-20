package lexicon.se;
import java.util.*;
public class Car extends Vehicle {

    private int numberOfDoors;
    private int numberOfPassengers;
    private String name;

    public Car(int numberOfDoors, int numberOfPassengers, String name) {
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
        this.name = name;
    }

    public Car(int vehicleId, String registrationNumber, String brand, int numberOfDoors, int numberOfPassengers, String name) {
        super(vehicleId, registrationNumber, brand);
        this.numberOfDoors = numberOfDoors;
        this.numberOfPassengers = numberOfPassengers;
        this.name = name;
    }

    public int getNumberOfDoors() {
        return numberOfDoors;
    }

    public void setNumberOfDoors(int numberOfDoors) {
        this.numberOfDoors = numberOfDoors;
    }

    public int getNumberOfPassengers() {
        return numberOfPassengers;
    }

    public void setNumberOfPassengers(int numberOfPassengers) {
        this.numberOfPassengers = numberOfPassengers;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Car{" +
                "numberOfDoors=" + numberOfDoors +
                ", numberOfPassengers=" + numberOfPassengers +
                ", name='" + name + '\'' +

                '}';
    }

    @Override
    public void derive() {
        System.out.println(toString());
    }


}
