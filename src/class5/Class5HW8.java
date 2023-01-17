package class5;
import java.util.Scanner;

public class Class5HW8 {
    public static void main(String[] args) {
        System.out.println("Enter your grade");
        Scanner scan = new Scanner(System.in);
        String grade = scan.nextLine();

        switch (grade){
            case "A":
                System.out.println("A-Excellent");
                break;
            case "B":
                System.out.println("B-Good");
                break;
            case "C":
                System.out.println("C-Average");
                break;
            case "D":
                System.out.println("D-Bad");
                break;
            default:
                System.out.println("Not Acceptable");
        }







    }
}
