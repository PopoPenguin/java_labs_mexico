package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 7:
 *
 *      Write the necessary code to receive a number in minutes from the user, up to 1,000,000,000.
 *      How many years and days does that number in minutes represent?
 *
 *      For this exercise each year has 365 days.
 *
 */
public class Exercise_07 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        double minutes;
        // repeats asking for input until number is within range
        do {
            System.out.print("Enter number of minutes up to 1,000,000,000): ");
             minutes = input.nextDouble();    //input of minutes

        } while (minutes < 0 || minutes > 1000000000) ;


            double minutesPerDay = 1440;              //number of minutes per day
            double minutesPerYear = 525600;           //number of minutes per year


            int years = (int) (minutes / minutesPerYear);   //calculating # of years based on input

            double remainingMinutes = (minutes - (years * minutesPerYear));  //calculating remaining minutes after # of years

            int days = (int) (remainingMinutes / minutesPerDay);    //converting # of remainingMinutes to days

            System.out.println(minutes + " is equal to " + years + " years " + days + " days.");
    }
}