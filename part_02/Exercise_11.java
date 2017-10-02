package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 11:
 *
 *      Calculate investment value
 *
 *      Recieved the following args from user:
 *          - investment amount
 *          - interest rate in percentage
 *          - number of years to invest
 *
 *      Print future value to the console.
 *
 */

public class Exercise_11 {
    public static void main(String[] Strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter investment amount: ");
        double investment = input.nextDouble();      //input of investment as a double

        System.out.print("Enter annual interest rate in percentages: ");
        double interest = input.nextDouble();       //input of interest as a double

        System.out.print("Enter number of years: ");
        double years = input.nextDouble();          //input of years as a double

        //calculation of future value = present value (1 + (interest as a percentage/100))^years
        double value = investment * Math.pow(1 + (interest/100), years);


        System.out.println("Your value over " + years + " years is $" + value);

    }
}

