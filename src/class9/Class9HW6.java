package class9;
public class Class9HW6 {
    public static void main(String[] args) {
                /*
        Create an array of countries. While retrieving all values from an array print capital
        for each country choose any five countries.
         */

        String[] country={"Bangladesh","Ghana","Pakistan","USA","Iran"};
        country[0]="Dhaka";
        country[1]="Accra";
        country[2]="Islamabad";
        country[3]="Washington,D.C";
        country[4]="Tehran";

        for (int i = 0; i < country.length; i++) {
            System.out.println(country[i]);
        }
    }
}
