package chapter_self_test.io_threads;

/*
created by PopoPenguin on 10/25/17
*/


//
//        create a thread class (that implements Runnable) - reference the examples from
//        yesterday. In the run method we need to call a method (let's call it copyFile(str1, str2). copyFile()
//        will copy a file byte by byte from location to another your disk. The two arguments copyFile(str1, str2)
//        should receive are the location of the file to read (str1), and the location of the file to write(str2).
//
//
//        after you have created the thread class, and created the copyFile(String readFrom, String writeTo)
//        method - create a new class with a main() that will create at least 5 threads that will read the same file
//        and copy it to 5 different files (they can all be in the same folder)


import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class IoThreads implements Runnable {

    Thread thrd;
    String readFrom;
    String writeTo;

    public IoThreads (String readFrom, String writeTo){
        thrd = new Thread (this);
        this.readFrom=readFrom;
        this.writeTo=writeTo;
        thrd.start();

    }

    @Override
    public void run() {

        copyFile();

    }
    public void copyFile (){

        int i;
        // Open and manage two files via the try statement.
        try (FileInputStream fin = new FileInputStream(readFrom);
             FileOutputStream fout = new FileOutputStream(writeTo))
        {

            do {
                i = fin.read();
                if(i != -1) fout.write(i);
            } while(i != -1);

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }


    }


}
