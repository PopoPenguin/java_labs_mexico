package part_02;

import java.util.Scanner;

/**
 * Part 2 Exercise 4:
 *
 *      Pounds to kilos
 *
 *      One pound is 0.454 kilograms.
 *
 *
 */
public class Exercise_04 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter pounds: ");
        double pounds = input.nextDouble();     //input of pounds

        double kilos = pounds * .454;           //.454 kilo/pounds

        System.out.println(pounds + " pounds is " + kilos + " kilos");
    }
}
