package part_04;

/**

 Create, populate, and print out a two-dimensional array that will show the following output:

 0 1 2 3 4 5 6 7 8 9
 10 11 12 13 14 15 16 17 18 19
 20 21 22 23 24 25 26 27 28 29
 30 31 32 33 34 35 36 37 38 39
 40 41 42 43 44 45 46 47 48 49

 */

class Exercise_03 {

    public static void main(String[] args) {

        //this populates array by size 5 x 10
        int [] [] array = new int [5] [10];
        int counter = 0;        // counter used to fill the spots in array
        for (int i= 0; i< array.length;i++){
            for (int j= 0; j<array[i].length; j ++){
                array [i][j] = counter++; //increments the value of counter for each index position
            }
        }


        for (int i=0; i<array.length; i++){
            counter = 0;            //counter initialized to 0 to keep track of position

            for (int j=0; j<array[i].length; j++) {
                System.out.print (array[i][j] + " ");
                counter ++;         //counter is incremented to keep track of position
                if (counter==array[i].length){  //if counter = the length of array i
                    System.out.println();       //will print a new ln
                }
            }
        }
    }
}