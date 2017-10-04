package part_03;

import java.util.Scanner;

/**

 Write a class that has at least 3 methods, one of which being a main() method. The two other methods need to use the
 "return" keyword. Use the values returned from these two methods to accomplish a task.

 */

public class Exercise_02 {
    public static void main(String[] args) {

        Exercise_02 one = new Exercise_02();

        Scanner input = new Scanner(System.in);

        System.out.print("Enter first number: ");
        int number = input.nextInt();     //input of number

        int first = one.numberOne(number);

        System.out.print("Enter second number: ");
        number = input.nextInt();     //input of number

        int second = one.numberTwo(number);


        System.out.println(first + " is the last number divisible by 2 for the first input");
        System.out.println(second + " is the last number divisible by 3 for the second input");
        System.out.println("The product of the first number and second number ");
        System.out.println( "divisible by 2 and 3 is " + first * second);
    }


    public int numberOne(int x) {
        int a = 0;
        for (int i = 0; i <= x; i++) {
            if (i % 2 == 0) {
                a = i;
            }
        }
        return a;
    }

    public int numberTwo(int y) {
        int b = 0;
        for (int i = 0; i <= y; i++) {
            if (i % 3 == 0) {
                b = i;
            }
        }
        return b;
    }
}
