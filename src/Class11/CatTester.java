package Class11;

public class CatTester {

    public static void main(String[] args) {

        // Creating sn object from a class
        Cat cat1= new Cat();

        cat1.name="Lego";
        cat1.breed="Van Cat";
        cat1.age=2;
        cat1.color="Grey";
        cat1.attitude=false;
        cat1.eat();



Cat cat2= new Cat();

        cat2.name="Loki";
        cat2.breed="Domestic";
        cat2.age=20;
        cat2.color="White";

        System.out.println("cat2.breed");
        cat2.speak();


    }
}
