package part_08;

public class Stack {
    private char[] ch;           //creating an array of char type to store values
    private int location ;       //only need one location since push and pop work on the same spot

    Stack (int a){               // constructor for Stack setting the size as argument and setting location to 0
        ch = new char[a];        //creating an char array of size a
        location = 0;            //setting the location of the array to 0
    }

    //method to insert value into stack
    public void push(char input) throws DataStructureFull {

            if (location == ch.length) {                    //if location is same as length of array
                throw new DataStructureFull(location);      //throw DataStructureFull exception
            } else if (location < ch.length) {
                ch[location++] = input;                     //add input value to location spot and increment after insertion

            }


    }

    //method to print out the current location
    public void pop() throws DataStructureEmpty {

            if (location==0){                                 // if location is 0 then stack is empty
                throw new DataStructureEmpty();       //throw DataStructureEmpty exception
            } else
                location--;                          //decrement the location to the last index the last value was set
            System.out.println(ch[location]);        //print out last value entered
            return;




    }

    //retrieve the current location
    public int getLocation(){

        return location;                    //return location
    }


}

