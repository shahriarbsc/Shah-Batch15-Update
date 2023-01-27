package Class12;

public class CarTester {
    public static void main(String[] args) {

        // Create the object of the class

        Car bmw = new Car(); // bmw is the object

        bmw.make = "BMW";
        bmw.model = "i7";
        bmw.year = 2023;
        bmw.color = "Grey";

        bmw.moveForward();
        bmw.applyBrakes();


// create two classes of your choice and call the methods from those classes.

        Car audi = new Car();
        audi.model="E-tron";
        audi.make="Audi";
        audi.year=2022;
        audi.color="Black";
        audi.moveForward();



    }
}
