package class8;

public class ContinueKeywordDemo1 {
    public static void main(String[] args) {
        // no loop without boolean , i = is called boolean

        for (int i = 0; i < 10; i++) {

            if (i==3 ||i==6|| i==9) {
                continue;     // skip
            }
                System.out.println(i); // this line skipped when i =3,6,9

        }

    }
}
