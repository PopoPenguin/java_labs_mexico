package part_10.threads_lab_exercises;

/*
created by PopoPenguin on 10/25/17
*/


public class ThreadOptions implements Runnable {

    Thread thrd;

    public ThreadOptions() {
        thrd = new Thread (this);
        thrd.start();
    }

    @Override
    public void run() {

    }
}
