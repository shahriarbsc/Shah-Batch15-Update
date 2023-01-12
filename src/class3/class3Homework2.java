package class3;

public class class3Homework2 {
    public static void main(String[] args) {

        //Create a java program and name it Temperature Check. Create variable to store temperature.
        //Your program should check if temperature is below 32 then it should print "Water will freeze with temperature"
        //Otherwise "Water will NOT freeze with temperature."

        int temperature = 38;

        if (temperature < 32){

            System.out.println("Water will freeze with temperature " + temperature);
        }else{
            System.out.println("Water will NOT freeze with temperature" + temperature);

        }
    }

}