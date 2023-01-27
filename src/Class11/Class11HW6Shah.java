package Class11;

public class Class11HW6Shah {
    public static void main(String[] args) {

       /* Create a 2D array or integer type and store numbers in 3 rows and 3 columns.
                Print the sum of all numbers.
                */

        int[][] numbers = {{70, 80, 90,},{10, 20, 30,}, {40, 50, 60}, };

        int sum = 0;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                sum += numbers[i][j];

            }
        }
        System.out.println("The summary of all numbers is " + sum);

    }
}


