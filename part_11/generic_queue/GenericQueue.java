package part_11.generic_queue;

/*
created by PopoPenguin on 10/24/17
*/


//creating int generic_queue class of parameter entered

import java.util.ArrayList;

public class GenericQueue<T> {

    private ArrayList<T> q;                           //declares an instance variable q that is an array of type T
    private int putLocation, getLocation;       //declares two instance variable for the put and get location
    private int size = 1000;

    GenericQueue(){                             //creates a class for generic_queue
        q = new ArrayList();
        putLocation = getLocation = 0;          //initializes the value of put and get to 0

    }

    public GenericQueue(int size) {
        this.size = size;
        q = new ArrayList();
        putLocation = getLocation = 0;
    }

    synchronized public void put(T num) throws DataStructureFull {                  //creates a put method
        if (putLocation == size) {                  //tests if the generic_queue is full
            throw new DataStructureFull(putLocation);  //throw DataStructureFull exception
        }
        q.add(num);
        putLocation++;                 //if not takes value and places in q[putLocation] then increments by 1
        notify();
        return;
    }

    synchronized public T get() throws DataStructureEmpty {                          //create a get method
        if (getLocation==putLocation){          //if getLocation is not the same as putLocation
            throw new DataStructureEmpty();     //throw DataStructureEmpty exception
        }

        notify();
        return q.get(getLocation++);                //if false returns value at location
    }

    public int length(){                       //create a method to determine size of array q

        return q.size();
    }

    public boolean hasNext(){
        if (getLocation<putLocation){
            return true;
        }
        return false;
    }


}


