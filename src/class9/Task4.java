package class9;
import java.util.Scanner;
public class Task4 {
    public static void main(String[] args) {
/*
    4)  Write a program to ask a user to enter item they want to buy and the price of that item.
    user will be entering 5 items.
    Every time user enters money accumulate the price and tell the user how much is left to pay off.
    If user give more money program should return a change. Whenever a user done with payments program
    should say "Thank you for shopping!"

    breakdown this above problem into 4 to 5 steps that we can write the code for and can test those independently
     */
      /*  So these are my breakdowns:
        1- Ask the user for item price and item name
        2-accumulate the price
        3- tell the user how much total that they should pay
        4- if user give more money program should return a change
        5-Thank you for shopping!
       */
        Scanner scanner = new Scanner(System.in);

        double totalPrice = 0;
        for (int i = 0; i < 3; i++) {

            System.out.println("Please Enter the item and its price");
            String itemName = scanner.next();
            double itemPrice = scanner.nextDouble();
            totalPrice = totalPrice + itemPrice;
            System.out.println("This is the total amount that you have to pay "+totalPrice);
        }
        System.out.println("Please pay for the items");
        double amountPaid=scanner.nextDouble();

        if(amountPaid>totalPrice){
            double change=amountPaid-totalPrice;
            System.out.println("Hey here is your change "+change);
        }
        System.out.println("Thank you for shopping!");

        }

    }
