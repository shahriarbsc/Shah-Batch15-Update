package class9;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        for (int i = 0; i < 10; i++) {
            System.out.println("Do you want apply for a  credit card");
            String userResponse = scanner.next();  // use string or boolean
            if (userResponse.equalsIgnoreCase("yes")) {
                break;
            }


        }

    }
}
