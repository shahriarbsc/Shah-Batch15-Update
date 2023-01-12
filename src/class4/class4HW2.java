package class4;

import class1.Main;

public class class4HW2 {
    public static void main(String[] args) {

    //Create a Java program and store values of mortgage rate and mortgage price.
        // First, program should check if rate is higher than 4.5 user will not buy a house,
        // otherwise user will consider buying. Once user decides to buy a house,
        // if price of the house is larger than 200000 than user will take a loan,
        // otherwise user will pay cash

double mortgageRate=1.5;
int housePrice=250000;

if (mortgageRate>4.5){
    System.out.println("user will not buy a house");

}else{
    System.out.println("user will consider buying");
}

if (housePrice>200000){
    System.out.println("user will take a loan");
}else{

    System.out.println("user will pay cash");
}



    }


}
