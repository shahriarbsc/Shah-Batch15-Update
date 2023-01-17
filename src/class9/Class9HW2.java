package class9;
public class Class9HW2 {
    public static void main(String[] args) {

        /*
        Create an array of names and store all names of your group. Then print your name from that array.
        (use 2 different ways of creating an array).
         */

        String[] names={"Shah","Yuliya","Pat","Maziar","Gurcan","Rosalia","Victor","Razaqi","Sardar","Zhadyra"};

        System.out.println(names[0]);

        System.out.println("*******************************");

        String[]names1=new String[10];
        names1[0]="Pat";
        names1[1]="Yuliya";
        names1[2]="Gurcan";
        names1[3]="Rosalia";
        names1[4]="Sardar";
        names1[5]="Shah";
        names1[6]="Razaqi";
        names1[7]="Maziar";
        names1[8]="Victor";
        names1[9]="Zhadyra";

        System.out.println(names1[5]);
    }
}
