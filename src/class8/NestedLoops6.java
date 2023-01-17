package class8;

public class NestedLoops6 {
    public static void main(String[] args) {

        /* 1 2 3 4 5
           1 2 3 4 5
           1 2 3 4 5
         */
        for (int i = 0; i < 3; i++) { // executes the below code 3 times

            for (int j = 1; j <= 5; j++) {


                System.out.print(j + " "); // prints the value of i 5 times
            }
            System.out.println();
        }

    }
}
