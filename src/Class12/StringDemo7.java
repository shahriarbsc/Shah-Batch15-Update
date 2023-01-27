package Class12;

public class StringDemo7 {
    public static void main(String[] args) {

        //checking the word in string start with or end with

        // only those methods can be change which return a string

        String str="I love java";
        boolean startsWith=str.startsWith("I");
        System.out.println(startsWith);

        System.out.println(str.endsWith("java"));

        //method change is when multiple methods are called on the same line

        // only those methods can be chained which returns a String
        System.out.println(str.toLowerCase().startsWith("i"));
        //System.out.println(str.length().startsWith("i"));


        System.out.println(str.toLowerCase().startsWith("i"));

        // contains method check in the word
         System.out.println(str.contains("java"));


    }
}
