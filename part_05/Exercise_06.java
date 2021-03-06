package part_05;

/**
 *
 * Study this functional example of using recursion to print the fibonacci sequence until you can comfortably explain
 * how it works and why to a stranger.
 *
 */


import java.util.Scanner;

public class Exercise_06 {

    public static void main(String[] args) {
        Scanner stdIn = new Scanner(System.in);

        System.out.print("How many numbers do you want to print? ");
        int iter = stdIn.nextInt();
        for (int i=0;i<iter;i++) {
            System.out.print(fibonacci(i) + " ");
        }

        stdIn.close();
    }

    public static long fibonacci(long n) {
        if (n<0)
            throw new IllegalArgumentException("Can't accept negative arguments");
        return
                (n < 2) ? n : fibonacci(n-1) + fibonacci(n-2);
        // if n less than 2 than value is n otherwise it is recursion of fibonacci (n-1) +  (n -2)
        //fibonacci (4) = fibonacci (3) + fibonacci (2)
        //                fibonacci (2) + fibonacci (1) + fibonacci (1) + fibonacci (0)
        //                fibonacci (1) + fibonacci (0) + fibonacci (1) + fibonacci (1) + fibonacci (0)
        //fibonacci (3) = fibonacci (2) + fibonacci (1)
        //                fibonacci (1) + fibonacci (0) + fibonacci (1)
    }
}