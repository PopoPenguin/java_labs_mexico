package part_01;

/**
 * Part 1 Exercise 11:
 *      In the U.S., if there is:
 *          - One person who is born every 6 seconds
 *          - One person who dies every 12 seconds
 *          - One person who immigrates every 40 seconds
 *
 *      Write the necessary code to display the total population for the next 3 years (without a leap year)
 *
 *      Let's say the current population is 380,123,456.
 *
 */
public class Exercise_11 {

    public static void main(String[] strings) {
        int startPop = 380123456;
        int totalSec = 3 * 365 * 24 * 60 * 60;
        int dead = totalSec / 12;
        int born = totalSec / 6;;
        int immigration = totalSec / 40;;

        int endPop = startPop - dead + born + immigration;;

            System.out.println("Total population over 3 years is " + endPop);

    }
}
