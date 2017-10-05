package part_04;
import java.util.Scanner;


/**

 Read in 10 integers from the user. Place all 10 integers into an array in the order they were received.
 Print out the second integer received, followed by the 4th, then the 6th, then the 8th, then the 10th.
 The print out the 9th, 7th, 5th, 3rd, and 1st.

 Example input: 1,2,3,4,5,6,7,8,9,10
 Example output: 2,4,6,8,10,9,7,5,3,1

 Output can be on one line or many lines. However you like.

 */

class Exercise_01 {

    public static void main(String[] args) {
        int number;

        Scanner input = new Scanner(System.in);
        //creates a new array called array1 of size 10
        int[] array1  = new int [10];
        //asks for input from user 10 times and stores input into each spot of the array
        for (int i = 0; i < array1.length; i++) {
            System.out.print("Enter number: ");
            array1[i] = input.nextInt();     //input of number into the array in position i
        }

        //this iterates through the positions of array and prints out the value of the positions
        //depending on the position from 0 to 9

        for (int i=0; i<array1.length;i++) {
            if (i%2 !=0)
                System.out.print(array1[i] + " , ");
        }

        System.out.printf("");

        //this iterates through the positions of array and prints out the value of the positions
        //depending on the position from 9 down to 0

        for (int i=array1.length-1; i>=0; i--){
            if (i%2 == 0)
                System.out.print(array1[i] + " , ");
        }
    }
}

