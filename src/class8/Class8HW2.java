package class8;

import java.util.Scanner;

public class Class8HW2 {


    //(2) Create a program that will be asking user to apply for a credit card 10 times. As soon you get an “yes” from a user program should stop asking.

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        for (int request = 0; request < 10; request++) {
            System.out.println("Do you need a credit card?");
            String answer = scanner.next();
            if (answer.equalsIgnoreCase("yes")) {
                break;
            }
        }
    }
}
