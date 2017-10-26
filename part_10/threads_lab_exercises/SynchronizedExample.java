package part_10.threads_lab_exercises;

/*
created by PopoPenguin on 10/25/17
*/


public class SynchronizedExample {

    //two methods that both start with synchronized

    synchronized void sayHi(){

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thrd = Thread.currentThread();
        System.out.println(thrd.getName());
        System.out.println("Hi");

        //thrd.notifyAll();
    }

    synchronized void sayBye() {

        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        Thread thrd = Thread.currentThread();
        System.out.println(thrd.getName());

        System.out.println("Bye");
        //thrd.notifyAll();

    }


}
