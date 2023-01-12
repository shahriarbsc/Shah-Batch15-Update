package class4;

import java.util.Scanner;


public class class4HW4 {
    public static void main(String[] args) {
        // you are a DMV representative and you need to ask customer their age.
        //if they are 18 and older you will issue a driver license them.
        //otherwise you will offer them to get a loan learners permit.

        Scanner scan= new Scanner(System.in);
        System.out.println("Please confirm your age");
        int age= scan.nextInt();

        if(age>18){
            System.out.println("DMV representative will be issued driver license");
        }else{
            System.out.println("DMV representative will be issued learner permit");
        }




    }
}
