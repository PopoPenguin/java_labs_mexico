package chapter_self_test.multi_thread_practice;

/*
created by PopoPenguin on 10/24/17
*/


public class BeepMeepController {


    public static void main(String[] args) {
        BeepThread thread1 = new BeepThread("Beep");
        BeepThread thread2 = new BeepThread("Sleep");
        MeepThread thread3 = new MeepThread("Jeep");
        MeepThread thread4 = new MeepThread("Meep");

        try {
            thread1.thrd.join();
            thread2.thrd.setPriority(2);
            thread3.thrd.join();
            thread4.thrd.join();

        } catch (InterruptedException e) {
            e.printStackTrace();
        }




        System.out.println("All Beeped and Meeped out!!");
    }


}
