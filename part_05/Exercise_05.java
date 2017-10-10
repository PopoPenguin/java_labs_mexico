package part_05;

/**
 * Write one class. This class must have two methods, a main() + a recursive method. The recursive method must take in
 * an integer as a parameter. The recursive method must then print out "Hello Recursion!" as many times as the "initial"
 * input parameter dictates. For instance if the int passed to the recursive method is 10. The recursive method must print
 * out "Hello Recursion!" 10 times.
 *
 */


class Exercise_05 {


    public static void main(String[] args) {

        Exercise_05 five = new Exercise_05();   //creating an object of the class to be able to execute recursive method
        int sum = five.recursive(10);   // calculating sum of the recursion
        System.out.println(sum);            //printing out the sum of the recursion
    }

    int recursive(int x) {
        if (x == 1) {               //breaks out of recursion method when x ==1
            System.out.println("Hello Recursion!! " + x); //outputting Hello Recursion
            return 1;
        }

        System.out.println("Hello Recursion!! " + x);

        return x + recursive(x - 1);    //return recursion value


    }

}