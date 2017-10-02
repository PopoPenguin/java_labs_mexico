package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 5:
 *
 *      Write a program called PrintNumberInWord which prints "ONE", "TWO",... ,
 *      "NINE", "OTHER" if the int variable "number" is 1, 2,... , 9, or other, respectively.
 *      Use a "nested-if" statement;
 *
 *
 */
public class Exercise_05 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter number: ");
        int number = input.nextInt();       //input of number

        // if number is between range 1-9 proceeds through nested if
        // until number is found and prints out the number in words
        // otherwise exits if and prints out OTHER
        if (number < 10 && number > 0) {

            if (number < 9) {

                if (number < 8) {

                    if (number < 7) {

                        if (number < 6) {

                            if (number < 5) {

                                if (number < 4) {

                                    if (number < 3) {

                                        if (number < 2) {
                                            System.out.println("One");

                                        } else
                                            System.out.println("TWO");
                                    } else
                                        System.out.println("Three");
                                } else
                                    System.out.println("Four");
                            } else
                                System.out.println("Five");
                        } else
                            System.out.println("Six");
                    } else
                        System.out.println("Seven");

                } else
                    System.out.println("Eight");
            } else
                System.out.println("Nine");
        } else
            System.out.println("Other");

    }
}
