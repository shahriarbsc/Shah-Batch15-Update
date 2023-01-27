package Class11;
public class Class11HW7Shah {
    public static void main(String[] args) {

//Create a 2D Array or integer type where you will store odd and even numbers in 3 rows and 4 columns.Develop a program
        // which will identify on even numbers

        int[][] numbers = {{1, 2, 3, 4},
                {5, 6, 7, 8},
                {9, 10, 11, 12}
        };

        int even = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                even++;
                numbers[i][j] = even;
                if (numbers[i][j] % 2 == 0) {
                    System.out.println(numbers[i][j]);
                }
            }
        }
    }
}








