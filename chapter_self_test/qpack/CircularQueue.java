package chapter_self_test.qpack;

// A circular generic_queue.
class CircularQueue implements ICharQ {
    private char q[]; // this array holds the generic_queue
    private int putloc, getloc; // the put and get indices

    // Construct an empty generic_queue given its size.
    public CircularQueue(int size) {
        q = new char[size+1]; // allocate memory for generic_queue
        putloc = getloc = 0;
    }

    @Override
    public void put(String ch) {

    }

    // Put a characer into the generic_queue.
    public void put(char ch) {
    /* GenericQueue is full if either putloc is one less than
       getloc, or if putloc is at the end of the array
       and getloc is at the beginning. */
        if(putloc+1==getloc |
                ((putloc==q.length-1) & (getloc==0))) {
            System.out.println(" -- GenericQueue is full.");
            return;
        }

        q[putloc++] = ch;
        if(putloc==q.length) putloc = 0; // loop back

    }

    // Get a character from the generic_queue.
    public char get() {
        if(getloc == putloc) {
            System.out.println(" -- GenericQueue is empty.");
            return (char) 0;
        }

        char ch = q[getloc++];
        if(getloc==q.length) getloc = 0; // loop back
        return ch;
    }
}