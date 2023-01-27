package Class11;
import java.util.Scanner;
public class DogHW2ShahTester {

    public static void main(String[] args) {

        DogHW2Shah Husky = new DogHW2Shah();
        Husky.name = "Yuki";
        Husky.color = "White";
        Husky.size = "Avarage";
        Husky.age = 3;
        Husky.attitude = true;

        System.out.println(Husky.attitude);
        Husky.attitude();

        DogHW2Shah Bulldog =new DogHW2Shah();
        Bulldog.name = "Mikey";
        Bulldog.color = "DarkBrown";
        Bulldog.size = "Big";
        Bulldog.age =4;
        Bulldog.attitude = false;

        System.out.println(Bulldog.attitude);
        Bulldog.bark();

        DogHW2Shah Labrador = new DogHW2Shah();
        Labrador.name = "Tony";
        Labrador.color = "White";
        Labrador.size = "Huge";
        Labrador.age = 5;
        Labrador.attitude=true;

        System.out.println(Labrador.attitude);
        Labrador.eat();

    }
}
