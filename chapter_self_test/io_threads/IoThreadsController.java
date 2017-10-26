package chapter_self_test.io_threads;

/*
created by PopoPenguin on 10/25/17
*/


public class IoThreadsController {

    public static void main(String[] args) {

        System.out.println("Starting to copy 5 threads to copy airline files...");
        String readFrom = "/Users/PopoPenguin/CodingNomads/Airline_Accidents.csv";
        String writeTo = "/Users/PopoPenguin/CodingNomads/";

        IoThreads thread_1 = new IoThreads(readFrom,writeTo+"1.csv");

        IoThreads thread_2 = new IoThreads(readFrom,writeTo+"2.csv");
        IoThreads thread_3 = new IoThreads(readFrom,writeTo+"3.csv");
        IoThreads thread_4 = new IoThreads(readFrom,writeTo+"4.csv");
        IoThreads thread_5 = new IoThreads(readFrom,writeTo+"5.csv");

//
//        try {
//            thread_1.thrd.join();
//            thread_2.thrd.join();
//            thread_3.thrd.join();
//            thread_4.thrd.join();
//            thread_5.thrd.join();
//
//        } catch (InterruptedException e) {
//            e.printStackTrace();
//        }


        System.out.println("All done copying!!!");

    }
}
