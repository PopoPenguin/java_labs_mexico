package part_09;

/*
created by PopoPenguin on 10/18/17

Demonstrate how to read file using BufferedInputStream - print each byte - be sure to close all connections
*/

import java.io.*;

public class BufferedInputDemo {


    public static void main(String[] args) throws IOException {
        //create integer i for return of read()
        int i ;
        //check to see if file is listed
        if(args.length != 1) {
            System.out.println("Usage: Read file using BufferedInputStream to");
            return;
        }

        // try with resources using command line argument for source of file
        try (BufferedInputStream bin = new BufferedInputStream(new FileInputStream(args[0]))) {
            //reading input of file and storing into i byte per byte
            do {
                i = bin.read();
                if(i != -1)                             //checking each byte to ensure not end of file
                    System.out.print((char)i);          //casting to char to be recognizable


            }while (i!=-1);                             //continue with do while loop until end of file is reached
        }catch(IOException exc) {                       //catching IOException
            System.out.println("I/O Error: " + exc);    //printing out exception if caught
        }
    }
}
