package class5;
import java.util.Scanner;
public class Class5HW3 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your quiz scores from 1-100");
        double quiz = input.nextDouble();

        System.out.println("Please enter your midterm scores from 1-100");
        double midterm = input.nextDouble();

        System.out.println("Please enter your final scores from 1-100");
        double finalScore = input.nextDouble();

        double average = (quiz + midterm + finalScore) / 3;

        if (average > 90) {
            System.out.println("grade A");

        } else if (average >= 70 && average < 90) {
            System.out.println("grade B");

        } else if(average >= 50 && average < 70) {
            System.out.println("grade C");
        } else
            System.out.println("grade F");

        }
}
