package class5;
import java.util.Scanner;

public class Class5HW2 {
    public static void main(String[] args) {

        Scanner input=new Scanner (System.in);
        System.out.println("Please enter any number start from 1");
        int number =input.nextInt();

        if (number>=1&&number<=5){
            System.out.println("It is a weekday");

        } else if (number>=6&&number<=7){

            System.out.println("It is a weekend");
        }else {

            System.out.println("Invalid day");
        }

    }
}
