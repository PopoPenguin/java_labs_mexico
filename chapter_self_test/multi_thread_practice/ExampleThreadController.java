package chapter_self_test.multi_thread_practice;

/*
created by PopoPenguin on 10/24/17
*/


public class ExampleThreadController {

    public static void main(String[] args) {

        ExampleThread thread1 = new ExampleThread("Thread 1");
        ExampleThread thread2 = new ExampleThread("Thread 2");
        ExampleThread thread3 = new ExampleThread("Thread 3");

        try {
            thread1.thrd.join();
            thread2.thrd.join();
            thread3.thrd.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }


        System.out.println("All done!");

    }


}
