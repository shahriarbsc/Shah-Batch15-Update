package Class12;

public class StringDemo8 {
    public static void main(String[] args) {
// char at method allows us to count individual character.

        String str = "Java is love";
        char character = str.charAt(2);

 /*       System.out.println(character);

        for (int i = 0; i < str.length(); i++) {
            System.out.print(str.charAt(i));
        }
*/
        int counter = 0;
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == 'a') {
                counter++;
            }

        }
        System.out.println(counter);
    }
}

