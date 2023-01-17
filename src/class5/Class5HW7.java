package class5;

import java.sql.SQLOutput;
import java.util.Scanner;

public class Class5HW7 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter your country");
        String country = input.next();


        String language = "English";
        String language1 = "Bengali";
        String language2 = "Urdu";
        String language3 = "Hindi";
        String language4 = "Afghani";
        switch (country) {

            case "USA":
                System.out.println("You speak English");
                break;
            case "Bangladesh":
                System.out.println("You speak Bengali");
                break;
            case "Pakistan":
                System.out.println("You speak Urdu");
                break;
            case "India":
                System.out.println("You speak Hindi");
                break;
            case "Afghanistan":
                System.out.println("You speak Afghani");
                break;



        }


    }
}
