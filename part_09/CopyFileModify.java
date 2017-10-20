package part_09;

/* A version of CopyFile that uses try-with-resources.
   It demonstrates two resources (in this case files) being
   managed by a single try statement.

   Note: This code requires JDK 7 or later.

   Modified to complete questions 7 and 8 of chapter 10 self test
*/

import java.io.*;

class CopyFileModify {
    public static void main(String args[]) throws IOException
    {
        int i;

//        FileInputStream fin = null;
//        FileOutputStream fout = null;

        // First, confirm that both files has been given.
        if(args.length != 2) {
            System.out.println("Usage: CopyFile from to");
            return;
        }

        //Section of code for non try-with-resource
//        // Copy a File.
//        try {
//            // Attempt to open the files.
//            fin = new FileInputStream(args[0]);
//            fout = new FileOutputStream(args[1]);
//              //reading each character and  swapping if char i = ' '
//            do {
//                i = fin.read();
//                if ((char)i == ' '){
//                    i = '-';
//                }
//                if(i != -1) fout.write(i);
//            } while(i != -1);
//
//        } catch(IOException exc) {
//            System.out.println("I/O Error: " + exc);
//        } finally {
//            try {
//                if(fin != null) fin.close();
//            } catch(IOException exc) {
//                System.out.println("Error Closing Input File");
//            }
//            try {
//                if(fout != null) fout.close();
//            } catch(IOException exc) {
//                System.out.println("Error Closing Output File");
//            }
//

            // Open and manage two files via the try resource statement
            // also using character stream instead of byte stream
        try (FileReader fin = new FileReader (args[0]);
             FileWriter fout = new FileWriter (args[1]))
        {
            //do while loop until end of file is reached
            //read each char and set to i
            do {
                i = fin.read();
                //if i casted to char equals a space
                if ((char)i  == ' '){
                    i = '-';                //assign hyphen to i
                }
                if(i != -1) {               //if end of file has not been reached
                    fout.write(i);          //write the value of i to output file
                }
            } while(i != -1);
            //catch IOException thrown
        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
    }
}