package part_11.generic_queue;

public class DataStructureFull extends Exception {              //custom exception class for full data structure

    int i ;                                                     //int i to indicate index

    public DataStructureFull(int i) {                           //constructor for class exception
        this.i = i;
    }

    public String toString() {

        return "Array index out of bounds.   " + i + " is last spot!!!";    //return error and indicate the last index spot
    }
}
