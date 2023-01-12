package class5;

public class LogicalOperators2 {
    public static void main(String[] args) {

        System.out.println(true&&true);
        System.out.println(true&&false);
        System.out.println(false&&false);


        double mathScore = 92.5;
        double historyScore = 91.5;
        double scienceScore = 93.5;


        /*
if the score in all the subjects are greater than 90 print brilliant student otherwise print you need
to work hard
*/
/*
        if(mathScore>90.0){
            if(historyScore>90){
                if(scienceScore>90){
                    System.out.println("You are a brilliant Student");
                }else{
                    System.out.println("You need work harder");
                }
            }else{
                System.out.println("You need work harder");
            }

        }else{
            System.out.println("You need work harder");
        }
*/



        if (mathScore > 90&&historyScore>90&&scienceScore>90) {

            System.out.println("You are a brilliant Student");

        } else {
            System.out.println("You need hard worker");

        }
    }
}