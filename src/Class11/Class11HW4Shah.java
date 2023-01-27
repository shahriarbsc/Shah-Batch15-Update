package Class11;
public class Class11HW4Shah {
    public static void main(String[] args) {
        /*2)Create 2D array of cars:
          american, german, korean, italian.
                Then retrieve all values from that array using 2 different loops
        */


        String[][] cars = {{"American:", "GMC", "Chrysler", "Dodge"}, {"Germany:", "BMW", "Volkswagen", "Audi"},
                {"Korean:", "Hyundai", "Daewoo", "Sangyong"}, {"Italian:", "Fiat", "Lamborghini", "Alfa Romeo"}};


        for (int i = 0; i < cars.length; i++) {
            for (int j = 0; j < cars[i].length; j++) {
                System.out.print(cars[i][j] + "  ");
            }
            System.out.println();

        }


        System.out.println("-------------------------------------------------------------");


        int i = 0;
        int j = 0;

        while (i < cars.length) {
            while (j < cars[i].length) {
                System.out.print(cars[i][j] + "  ");
                j++;
            }
            System.out.println();
            j = 0;
            i++;
        }


    }
}
