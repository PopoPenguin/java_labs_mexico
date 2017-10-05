package part_04;

/**

 Here's an easy one for you.

 Create and populate an array with a length no less than 5. Use the enhanced for
 loop to iterate through the array and print out each value.

 */

class Exercise_05{
    public static void main(String[] args) {

     int [] array = new int [15];       //creating a one dimensional array of size 15
     for (int i=0; i<array.length; i++){          //populating my array from position 0 with the value 1 and incrementing values by 1
         array[i] = i+1;
     }
     for (int x :array ){               //cycling through array and printing the values of each array position
         System.out.println(array[x-1]);
     }
    }
}