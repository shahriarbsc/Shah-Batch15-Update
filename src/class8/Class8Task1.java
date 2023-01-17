package class8;

public class Class8Task1 {
    public static void main(String[] args) {

        boolean summer = true;
        int temp = 75;


        while (summer) {
            if (temp <= 100) {

                System.out.println("I Love summer because Temperature is " + temp);

            } else {
                summer = false;
                System.out.println("Its very hot " + temp);


                temp += 5; // increasing temp by 5

            }
        }
    }
}