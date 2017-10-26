package chapter_self_test.qpack;

// A dynamic generic_queue.
class DynQueue implements ICharQ {
    private char q[]; // this array holds the generic_queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty generic_queue given its size.
    public DynQueue(int size) {
        q = new char[size]; // allocate memory for generic_queue
        putloc = getloc = 0;
    }

    @Override
    public void put(String ch) {

    }

    // Put a characer into the generic_queue.
    public void put(char ch) {
        if(putloc==q.length) {
            // increase generic_queue size
            char t[] = new char[q.length * 2];

            // copy elements into new generic_queue
            for(int i=0; i < q.length; i++)
                t[i] = q[i];

            q = t;
        }

        q[putloc++] = ch;
    }

    // Get a character from the generic_queue.
    public char get() {
        if(getloc == putloc) {
            System.out.println(" -- GenericQueue is empty.");
            return (char) 0;
        }

        return q[getloc++];
    }
}