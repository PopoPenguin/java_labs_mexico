package part_11;

/*
Let's say you have an integer array and a string array. Write a single method printArray that can print all
the elements of both arrays. The method should be able to accept both integer arrays or string arrays.

Complete the code so that it prints the following lines:

 1
 2
 3
 Hello
 World

*/

class PrintArray {
    public static void main(String[] args) {

        PrintArray one =  new PrintArray();
        Integer [] x = {1,2,3};
        String [] y = {"Hello","World"};

        one.printArray(x);
        one.printArray(y);
        one.sumArray(x);
    }


    public <T> void printArray (T[]x){          //generic printArray

        for (T y : x){                          //enhanced for loop to printout data type T for array x
            System.out.println(y);              //print out value of y of data type T
        }
    }

    public <Y extends Number> double sumArray (Y[]x){    //generic sumArray
        double sum=0;                                      //sums all values of generic array given
        for (Y y: x){
            sum += y.doubleValue();
        }
        return sum;                                 //returns sum of array
    }


}