package class9;

public class Class9HW5 {
    public static void main(String[] args) {
        /*
        Create an array of size 5 on integers and calculate the sum of all elements in an array.
         */

        int[] numbers={1,2,3,4,5};
        int sum=0;

        for (int i = 0; i < numbers.length; i++) {
            sum+=numbers[i];
        }
        System.out.println(sum);


    }
}
