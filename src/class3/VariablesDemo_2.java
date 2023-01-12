package class3;

public class VariablesDemo_2 {

    public static void main(String[] args) {
        int age=10;

        /*
        to rename something right-click refactor- rename
         */
        System.out.println(age);

        age=20;
        System.out.println(age);
//works form top to bottom


        int number=10;
        age=number;        //i am saying to java replace the value of age with the value of number variable

        System.out.println(age);

        age=number+10;

        System.out.println(age);

        age=age+20;   //

        System.out.println(age);
    }
}
