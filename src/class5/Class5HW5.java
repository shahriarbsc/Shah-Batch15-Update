package class5;

import java.util.Scanner;

public class Class5HW5 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("please enter 3 double values, it must be distinct number");

        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        double num3 = input.nextDouble();

        if (num1>num2&&num1>num3){
            System.out.println("The largest number is " +num1);
        }else if (num2>num1&&num2>num3){
            System.out.println("The largest number us "+num2);

        }else {
            System.out.println("The largest number is "+num3);
        }

    }
}
