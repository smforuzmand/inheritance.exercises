package lexicon.se.program1;

public class Main {
    public static void main(String[] args) {

        Car car = new Car(4,4,"Volvo");
        Vehicle volvoCar =new Car( 1,"ABCDF",
                "Volvo",4,4,"XC90");
        Vehicle motorcycle =new Motorcycle(2,"ZDF","Honda",
                2.2,250,"race");
        Vehicle truck = new Truck(3,"XYZ","Iveco",
                2300,18,"Compound");
        //System.out.println(car.toString());This will call the object which is instantiated for Car class
        volvoCar.derive();
        motorcycle.derive();
        truck.derive();


    }
}