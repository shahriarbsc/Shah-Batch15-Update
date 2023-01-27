package Class11;

import java.util.Scanner;

public class DogTester {

    public static void main(String[] args) {
// Creating an actual object from the class Scanner.

        Scanner scanner = new Scanner(System.in);


        //This is how we create the object of a class
        Dog jacky = new Dog();

        jacky.sleep();      // using behaviour
        jacky.bark();


    }
}
