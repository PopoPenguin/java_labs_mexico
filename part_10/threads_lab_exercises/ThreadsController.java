package part_10.threads_lab_exercises;

/*
created by PopoPenguin on 10/25/17
*/


public class ThreadsController {

    public static void main(String[] args) {

        Thread thrd = Thread.currentThread();
        thrd.setPriority(Thread.MIN_PRIORITY);

        CreateThreads threads1 = new CreateThreads("Threads Imp 1");
        ExtendableThreads threads2 = new ExtendableThreads("Threads Ext 2");
        ExtendableThreads threads3 = new ExtendableThreads("Threads Ext 3");




    }


}
