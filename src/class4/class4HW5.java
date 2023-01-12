package class4;

import java.util.Scanner;

public class class4HW5 {
    public static void main(String[] args) {

        //Create a Java program that will ask user to input city and temperature.
        // Your program should convert Fahrenheit into celsius and print “The temperature is the city  is ”

Scanner scan=new Scanner(System.in);

        System.out.println("Please input your city");
        String city=scan.next();

        System.out.println("Please enter your city`s temperature");
        int tempF= scan.nextInt();

        double tempC=(tempF-17.7778);
        System.out.println("The temperature of the city  " +city+ " is "  +tempC+ "Celsius");








    }
}
