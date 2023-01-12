package class3;

public class IfElse_9 {
    public static void main(String[] args) {

       char c='M';

       if (c=='M')  //== compare the same or not
       {
           System.out.println("male");

       }

       String name= "Nat";

       //with non-primitive data type such as String we cant use ==symbol

       if(name.equals("Sam"))    //additional pair of parenthesis

       {
           System.out.println("Amazing student");
       }
// ! symbol can change true to false and false to true


        if(!name.equals("Sam"))

        {
            System.out.println("Super Amazing student");
        }









    }



}
