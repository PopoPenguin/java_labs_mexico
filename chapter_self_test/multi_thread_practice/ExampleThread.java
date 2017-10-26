package chapter_self_test.multi_thread_practice;

/*
created by PopoPenguin on 10/24/17
*/


public class ExampleThread implements Runnable {

    Thread thrd;

    public ExampleThread(String name) {
        thrd = new Thread(this, name);
        thrd.start();
    }

    @Override
    public void run() {
        for (int i = 0; i<5;i++){
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(this.thrd.getName() + " & count = " + i);
        }
    }
}

