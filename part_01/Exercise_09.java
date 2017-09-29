package part_01;

/**
 * Part 1 Exercise 9:
 *
 *      Write the necessary code to display the area of a rectangle, as well as the perimeter of
 *      a rectangle that has a width of 2.4 and a height of 6.4
 *
 */
public class Exercise_09 {

    public static void main(String[] strings) {

        double h = 6.4;
        double w = 2.4;
        double area = h * w;
        double perimeter = 2 * h + 2 * w; ;


        System.out.println("Rectangle with height " + h + " and width " + w);
        System.out.println("has area of " + area + " and perimeter of " + perimeter+ ".");

    }
}
