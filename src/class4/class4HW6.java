package class4;

import java.util.Scanner;

public class class4HW6 {
    public static void main(String[] args) {
        //Create a Java program that will ask if user has a credit card or not.
        // If your user does not have a credit card then offer them.
        // If they do have one ask what is balance on the card?
        // If balance of the card is larger than 1000, tell them to pay off immediately,
        // otherwise you can tell them that they can spend more.

        Scanner cardInput = new Scanner(System.in);

        System.out.println("Do you have a credit card");
        String card = cardInput.nextLine();

        if (card.equals("no")) {
            System.out.println("Would you like to have a credit card");
        } else {
            if (card.equals("yes")) {
                System.out.println("What is the balance of your credit card now");
            }

            int balance = cardInput.nextInt();
            if (balance > 1000) {


                System.out.println("Please pay the due immediately");
            } else {
                System.out.println("You can continue spending");
            }
        }
    }

}