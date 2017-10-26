package chapter_self_test.multi_thread_practice;

/*
created by PopoPenguin on 10/24/17
*/


public class MeepThread implements Runnable {

    Thread thrd;

    public MeepThread(String name) {
        thrd = new Thread (this, name);
        thrd.start();
    }

    @Override
    public void run() {
        for (int i = 0 ; i <15; i++){
            if (i%3==0) {
                System.out.println(thrd.getName());
            }
        }
    }
}
