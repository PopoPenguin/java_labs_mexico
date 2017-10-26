package part_11.generic_stack;

import part_08.DataStructureEmpty;
import part_08.DataStructureFull;

import java.util.ArrayList;

public class GenericStack <T> {
    private ArrayList<T> ch;           //creating an array of char type to store values
    private int location ;       //only need one location since push and pop work on the same spot
    private int size = 1000;

    GenericStack(){               // constructor for Stack setting the size as argument and setting location to 0
        ch = new ArrayList();        //creating an char array of size a
        location = 0;            //setting the location of the array to 0
    }

    GenericStack(int size){               // constructor for Stack setting the size as argument and setting location to 0
        ch = new ArrayList();        //creating an char array of size a
        location = 0;            //setting the location of the array to 0
        this.size= size;
    }

    //method to insert value into stack
    public void push(T input) throws DataStructureFull {

            if (location == size) {                    //if location is same as length of array
                throw new DataStructureFull(location);      //throw DataStructureFull exception
            } else if (location < ch.size()) {
                ch.add(input);                     //add input value to location spot and increment after insertion
                location++;

            }


    }

    //method to print out the current location
    public void pop() throws DataStructureEmpty {

            if (location==0){                                 // if location is 0 then stack is empty
                throw new DataStructureEmpty();       //throw DataStructureEmpty exception
            } else
                location--;                          //decrement the location to the last index the last value was set
            System.out.println(ch.get(location));        //print out last value entered
            return;




    }

    //retrieve the current location
    public int getLocation(){

        return location;                    //return location
    }


}

