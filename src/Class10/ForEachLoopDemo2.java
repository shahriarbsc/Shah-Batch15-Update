package Class10;

public class ForEachLoopDemo2 {
    public static void main(String[] args) {
/*
limitation of for each loop

 */
// print only the odd number from that array below with the help of normal loop.

        int[] arr = {10, 13, 20, 25, 45, 50};
        arr[1] = 0;
// this is how we update a single element in an array.

        for (int i = 0; i < arr.length; i++) {

            if (arr[i] % 2 != 0) {

                System.out.println(arr[i]);
            }
        }
// replace all the odd numbers in this array with the help of a normal loop.

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
                System.out.println(arr[i]);
            }
        }
        System.out.println("After replacing all odd numbers with zero");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }



    }
}
