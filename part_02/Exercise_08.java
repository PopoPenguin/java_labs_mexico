package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 8:
 *
 *      Receive a number between 0 and 1,000,000,000 from the user.
 *      Use while loop to find the number - when the number is found
 *      exit the loop and print the number to the console.
 *
 */
public class Exercise_08 {

    public static void main(String[] args) {

        double guess = 0;           //stating starting point of guess

        Scanner input = new Scanner(System.in);

        System.out.print("Enter number between 0 and 1,000,000,000: ");
        double number = input.nextDouble();     //input of number
        

        //checking if number is within range
        if (number >= 0 && number <= 1000000000) {
            System.out.println("Your number is " + number + ". My guess is " + guess);

            // checks if number is equal to initial guess otherwise incrementally increases
            // guess until guess is equal to number.  Prints line out when guess and number.

            while (guess != number) {
                guess ++;
            }
            System.out.println("My guess is " + guess + " matches your number " + number);

        } else

            System.out.println("Please enter a number between 0 and 1,000,000,000: ");
    }
}