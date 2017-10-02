package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 12:
 *
 *
 *      Receive the following arguments from the user:
 *          - miles to drive
 *          - MPG of the car
 *          - Price per gallon of fuel
 *
 *      Display the cost of the trip in the console.
 *
 *
 */

public class Exercise_12 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter miles to drive: ");
        double miles = input.nextDouble();          // input of miles

        System.out.print("Enter MPG of the car: ");
        double MPG = input.nextDouble();            // input of mpg

        System.out.print("Enter price per gallon of fuel: ");
        double price = input.nextDouble();          // input of price per gallon

        double cost = miles / MPG * price ;         //calculates cost

        //outputs cost to display 2 decimal places
        System.out.println("Cost of trip will be $" + String.format( "%.2f", cost ));

    }
}