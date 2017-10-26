package part_10.threads_lab_exercises;

/*
created by PopoPenguin on 10/25/17
*/


public class ExtendableThreads extends Thread {

    public ExtendableThreads(String name) {
        super(name);
        Thread thrd = Thread.currentThread();
        thrd.setPriority(Thread.MAX_PRIORITY);
        start();
    }

    public void sayHiBye(){

        SynchronizedExample ex1  = new SynchronizedExample();

        for (int i=0; i<15;i++){
            if (i%2==0){
                ex1.sayHi();
            }
            ex1.sayBye();
        }
    }

    @Override
    public void run() {
        System.out.println("starting sayHiBye method");

        sayHiBye();
        System.out.println(getName() + " is name of thread.");
    }


}
