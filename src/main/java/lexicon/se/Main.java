package lexicon.se;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(4,4,"benz");
        Motorcycle motorcycle =new Motorcycle(2.3,230,"race");
        Truck truck = new Truck(2300,8,"gasoline");
        car.derive();
        truck.derive();
        System.out.println();


    }
}