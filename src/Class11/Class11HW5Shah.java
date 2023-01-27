package Class11;
public class Class11HW5Shah {
    public static void main(String[] args) {
/*        Using 2D array create a grocery list.
                Inside you should have an array of veggies, fruits, dairy and sweets.
        Retrieve all values from that array using 2 different loops
*/

        String [][] groceryList ={{"Vegetables:","Zuccini","potato","Union",},{"Dairy:","Yogurt","Milk","Cream"},
                {"Fruits:","Plum","Mango","Apple"},{"Sweets:","Kandy","Marshmellow","Cupcakes"}};


        for (int i=0; i<groceryList.length; i++){
            for ( int j=0; j<groceryList[i].length; j++){
                System.out.print(groceryList[i][j] + "  ");
            }
            System.out.println();


        }
        System.out.println("----------------------------------------------------");

        int i=0;
        int j=0;

        while (i<groceryList.length){
            while (j<groceryList[i].length){
                System.out.print(groceryList[i][j]+" ");
                j++;
            }
            System.out.println();
            j=0;
            i++;

        }











    }
}
