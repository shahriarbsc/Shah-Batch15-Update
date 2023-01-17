package class9;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please Enter two Numbers starting point and ending point");
        int start = scanner.nextInt();
        int end = scanner.nextInt();

        System.out.println("Start " + start + " end " + end);

        int evenSum = 0;
        int oddSum = 0;

        for (int i = start; i <= end; i++) {
            if (i % 2 == 0) {
                evenSum += i; // can also
            } else {
                oddSum = oddSum + i; //can also be written like this oddSum+=i
            }
        }
        System.out.println("Sum of all the Even Numbers "+evenSum);
        System.out.println("Sum of all the Odd Numbers "+oddSum);




    }
}
