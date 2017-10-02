package part_02;


/**
 * Part 2 Exercise 10:
 *
 *      Write a program that prints out every prime number between 1 and 100
 *
 */
public class Exercise_10 {

    public static void main(String[] args) {

        long startTime = System.currentTimeMillis(); //used as a timer for start process
        for (int i = 1; i<=100000;i++) {           //starts dividend at 1 and counts up to 100
            int counter = 0;                      //initializes counter and resets per each increment of dividend

            for (int j = 1; j <= i/2; j++) {      //starts divisor at 1 and goes to dividend
                if (i % j == 0) {               //if dividend divided by divisor has a remainder of 0
                    counter++;                  //increase counter
                }
            }

            // a prime number is only divisible by itself and 1 so counter should only be 2 or less
            if (counter <= 2) {
                System.out.println("Prime number is " + i);     //prints out dividend
            }
        }
        long endTime = System.currentTimeMillis();  //used as timer for end time
        long diff = endTime -startTime;             //calculation for total time to execute
        System.out.println("diff time = " + diff);  //prints out time difference
    }
}
