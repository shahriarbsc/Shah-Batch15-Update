package class8;

public class NestedLoops5 {
    public static void main(String[] args) {

        for (int i = 0; i < 3; i++) {

            if(i==1) {
                System.out.println();
                continue;
            }
            for (int j=0; j<5; j++) // inner for loop

                    System.out.print("*");
            }
        System.out.println();

    }
    }
