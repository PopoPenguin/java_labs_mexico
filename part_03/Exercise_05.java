package part_03;
import java.util.Scanner;


/**
 *
 */
public class Exercise_05 {

    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);
        double number;
        String results = " is invalid";

        // read an integer from the user >=1 and <= 999,999,999

        do {
            System.out.print("Enter number between 1 and 999,999,999: ");
            number = input.nextDouble();     //input of number
        } while (number<1 || number >999999999);


        // use the && operator to see if the user's number is divisible by both 4 and 7
        if (number % 4 == 0 && number % 18==0) {
            results = " is divisible by both 4 and 18";
        }   else if (number % 4 == 0 || number % 18 == 0) {
            if (number % 4 == 0 ^ number % 18 == 0){
                results = (number % 4 == 0) ? " is exclusively divisible by 4" : " is exclusively divisible by 18";
            }
        }

        // use the || operator to see if the user's number is divisible by 4 or 7
        // use the ^ operator to see if the user's number is divisible for 4 or 7 exclusively
        // print out the results
        System.out.println(number + " " +  results);

    }
}
