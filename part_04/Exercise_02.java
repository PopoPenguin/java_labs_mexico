package part_04;

/**

 Use a for loop to count to 2017. While looping, populate an array with the
 value of your iterator (ie, i). Once populated, print out the odd values
 (ie, 2017, 2015, 2013) of the array in reverse order.

 */

class Exercise_02{

    public static void main(String[] args) {

        int iArray [] = new int[2017];  //defined array of size 2017

        //populates array with values of i+1 starting from index 0
        for (int i=0;i<=iArray.length-1; i++){
            iArray[i]=i+1;
        }

        for (int i=iArray.length-1;i>=0; i--){

            if (iArray[i]%2 == 1) {                 //checks to see if the value at index i is odd
                System.out.println(iArray[i]);
            }
        }
    }
}