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

        int startPop = 380123456;           //stating initial population
        int totalSec = 3 * 365 * 24 * 60 * 60;  //calculating total secs for 3 years
        int dead = totalSec / 12;           //calculating total dead during 3 years
        int born = totalSec / 6;            //calculating total born during 3 years
        int immigration = totalSec / 40;    //calculating total immigrated during 3 years

        int endPop = startPop - dead + born + immigration;  //formula to calculate totat population over 3 years
        // prints out value of endPop
        System.out.println("Total population over 3 years is " + endPop);

    }
}
