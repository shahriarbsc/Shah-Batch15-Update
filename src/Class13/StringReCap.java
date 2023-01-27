package Class13;

public class StringReCap {
    public static void main(String[] args) {

        //How can I print all the letters from this String one by one



        String str="Java is Great";

        for (int i = 0; i <str.length() ; i++) {
            System.out.println(str.charAt(i));
        }

// what is the input the charAt() method its int and out put is a char

//Count how many times letter a has appeared in the above string



        int count=0;
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)=='a'){
                count++;
            }
        }
        System.out.println("Letter a has appeared "+count+" Many times");


    }
}
