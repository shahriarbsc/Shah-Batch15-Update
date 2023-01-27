package Class10;

public class ArrayDemo1 {

    public static void main(String[] args) {

// create an array


        int[] arr={10,20,30,40,50};

        System.out.println(arr[4]);
        // can we print two numbers from an array?


        System.out.println(arr[1]+ "  "+arr[4]);

        // print all the elements from this array using a loop

        for (int i= 0; i <arr.length ; i++) {

            System.out.println(arr[i]);
        }
        System.out.println("**************************");

// enhanced for loop
 // whenver possible use below loop

for(int number:arr){
    System.out.println(number);
}
    }
}
