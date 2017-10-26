package part_04;

/**

 Implement, and populate a non-circular, consumptive generic_queue (once a value has been retrieved
 it cannot be retrieved again) of integers 0 through 100. Then print out every other
 value in the generic_queue.

 expected output: 0,2,4,6,8.....100

 */
class Exercise_06 {

    public static void main(String[] args) {

        Queue test = new Queue(101);        //creating a new generic_queue of size 101

        for (int i = 0; i<test.size(); i++){           //populating generic_queue incrementally from 0 to 100
            test.put(i);                       //placing into the generic_queue
        }


        for (int i = 0; i <test.size(); i++){
            if (i%2==0) {                       //test the position if it is first
                System.out.println(test.get()); //if the value is first it will get the value and print out
            } else if (i%2 !=0){                //test the position if it is alternating
                test.get();                     //if it is the alternating input it will get the value but not
            }                                   //print out

        }
    }
}


//creating int generic_queue class of parameter entered

class Queue {

    private int [] q;                           //declares an instance variable q that is an array
    private int putLocation, getLocation;       //declares two instance variable for the put and get location

    Queue (int a){                              //creates a class for generic_queue
        q = new int[a];
        putLocation = getLocation = 0;          //initializes the value of put and get to 0

    }

    public void put(int num) {                  //creates a put method
        if (putLocation == q.length) {                  //tests if the generic_queue is full
            System.out.println("GenericQueue is full");
            return;
        }
        q[putLocation++] = num;                 //if not takes integer and places in q[putLocation] then increments by 1

        return;
    }

    public int get() {                          //create a get method
        if (getLocation==putLocation){          //if getLocation is not the same as putLocation
            System.out.println("Spot is empty");    //states generic_queue is empty and returns 0
            return 0;
        }

        return q[getLocation++];                //if false returns value at location
    }

    public int size(){                       //create a method to determine size of array q

        return q.length;
    }
}



