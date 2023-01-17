package class9;
import java.util.Scanner;

public class Practice {
    public static void main(String[] args) {

          Scanner input = new Scanner(System.in);
                System.out.print("Please enter your favorite car make: ");
                String carMake = input.nextLine();
                String carOrigin;

                switch (carMake) {
                    case "BMW":
                        carOrigin = "german car";
                        break;
                    case "Toyota":
                        carOrigin = "japanese car";
                        break;
                    case "Maserati":
                        carOrigin = "italian car";
                        break;
                    default:
                        carOrigin = "unknown";
                        break;
                }

                System.out.println("Your favorite car is of origin: " + carOrigin);
            }
        }



