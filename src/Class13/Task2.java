package Class13;

public class Task2 {
    public static void main(String[] args) {

        //        2) Create a String and print it in reverse order (Sunday → yadnuS).

        String str = "Wednesday";

        for (int i = str.length()-1; i>=0; i--) {

            System.out.print(str.charAt(i));
        }


    }
}
