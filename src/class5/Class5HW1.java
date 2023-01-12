package class5;

import java.util.Scanner;

public class Class5HW1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter your height");
        int height = input.nextInt();

        if (height < 60) {
            System.out.println("short");
        } else if (height >= 60 && height < 72) {
            System.out.println("Medium");
        }else if (height>72){
            System.out.println("Tall");
        }else {
            System.out.println("invalid");
        }

input.close();

    }
}
