package part_09.queue;

/*
created by PopoPenguin on 10/24/17
*/


//creating int queue class of parameter entered

public class Queue {

    private int [] q;                           //declares an instance variable q that is an array
    private int putLocation, getLocation;       //declares two instance variable for the put and get location

    Queue (int a){                              //creates a class for queue
        q = new int[a];
        putLocation = getLocation = 0;          //initializes the value of put and get to 0

    }

    synchronized public void put(int num) throws DataStructureFull {                  //creates a put method
        if (putLocation == q.length) {                  //tests if the queue is full
            throw new DataStructureFull(putLocation);  //throw DataStructureFull exception
        }
        q[putLocation++] = num;                 //if not takes integer and places in q[putLocation] then increments by 1

        notify();
        return;
    }

    synchronized public int get() throws DataStructureEmpty {                          //create a get method
        if (getLocation==putLocation){          //if getLocation is not the same as putLocation
            throw new DataStructureEmpty();     //throw DataStructureEmpty exception
        }

        notify();
        return q[getLocation++];                //if false returns value at location
    }

    public int size(){                       //create a method to determine size of array q

        return q.length;
    }
}


