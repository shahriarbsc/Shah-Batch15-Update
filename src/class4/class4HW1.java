package class4;

public class class4HW1 {
    public static void main(String[] args) {

        //create a program to store a boolean value of whether user has diploma or not, if user has diploma, you should say congratulations,
        //otherwise program should suggest to get a degree.Then If users has a degree program should check gpa score.
        //if gpa score is higher or equals to 3.5 ->output should say "You are eligible for scholarship"
        // otherwise "You should have study harder"

boolean diploma =true;
double gpa= 3.9;

if (diploma) {
    System.out.println("congratulations");
}else {

    System.out.println("Get a degree");
}
if (gpa>=3.5){

    System.out.println("You are eligible for scholarship");
}else{
    System.out.println("You should have study harder");
}





    }






}
