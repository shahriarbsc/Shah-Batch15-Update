package class4;

import java.util.Scanner;

public class class4HW3 {
    public static void main(String[] args) {
        //you are a loan specialist and you need to ask user what is the amount of loan needed.
        //if the loan is less or equal to 200,000 then you would lend the money
        //otherwise you would reject the client

int loan=150000;
Scanner amount =new Scanner (System.in);
        System.out.println("what is the loan amount needed");

        int loanAmount= amount.nextInt();

        if (loanAmount<=200000){
            System.out.println("client will get the loan from loan specialist");

        }else{
            System.out.println("loan specialist will reject the client on loan");
        }






    }
}
