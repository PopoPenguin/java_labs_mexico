package part_10.threads_lab_exercises;

/*
created by PopoPenguin on 10/25/17
*/


public class CreateThreads implements Runnable {

    Thread thrd;                        // create an object of Thread

    CreateThreads (String name){

        thrd = new Thread (this, name);         // assign object of thread to this runnable constructor with name
        thrd.setPriority(Thread.NORM_PRIORITY);
        thrd.start();
    }

    @Override
    public void run() {

        System.out.println(thrd.getName());

    }
}
