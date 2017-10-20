package part_09;

/*
created by PopoPenguin on 10/19/17

Demonstrate how to read file using BufferedReader - demonstrate both the read() and readLine() methods()
be sure to close all connections
*/


import java.io.*;

public class BufferedReaderDemo {


    public static void main(String[] args) throws IOException {
        //change i to string for readLine vs int i for read()
        String i ;
        //check if file is given
        if(args.length != 1) {
            System.out.println("Usage: Readfile using BufferedReader");
            return;
        }

        //use BufferedReader to read in chars instead of bytes
        try (BufferedReader bin = new BufferedReader(new FileReader(args[0]))) {
            //while readLine is not null read each line and assign to i
            //print out the String read
            while (bin.readLine()!=null){
                i = bin.readLine();
                System.out.println(i);

            }
        //catches IOException when thrown
        }catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}


