package class2;

public class StringAdition {
    public static void main(String[] args) {
        String firstName="George";
        String lastName="Micheal";
        /*
        java executes code from top tp bottom but if we have multiple operations on the same lines it executes them from left to right
         */

        System.out.println("******"+firstName+""+lastName+"******");
        System.out.println("First name="+firstName);
        System.out.println("LastName="+ lastName);
        System.out.println("10"+"10");
        String space= "";
        System.out.println(firstName+space+lastName);
        System.out.println(firstName+""+lastName);
        System.out.println(firstName+10);
        System.out.println(firstName+true);





    }
}
