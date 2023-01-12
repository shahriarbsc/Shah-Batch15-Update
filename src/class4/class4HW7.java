package class4;

import java.util.Scanner;

public class class4HW7 {
    public static void main(String[] args) {

//Write a program to ask user to enter numbers of worked years and annual salary.
// If user worked for more or equals to 5 years than user is eligible for the bonus,
// otherwise he is not.
// Once user is eligible and salary is larger than 50000 than bonus = 5000,
// otherwise bonus=3000.

        Scanner input = new Scanner(System.in);

        System.out.println("How many years have you been working");

        int years= input.nextInt();

 if (years>=5){
     System.out.println("User is eligible for a bonus");

     System.out.println("What is your annual salary?");
 }

 int salary = input.nextInt();
 if(salary >50000){
     System.out.println("User is eligible for bonus of 5000");
 } else {
     System.out.println( "User will get bonus of 3000");
 }



    }
}
