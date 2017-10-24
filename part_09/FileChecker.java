package part_09;

/*
created by PopoPenguin on 10/20/17

Write a class that can get the date of the last modification, can check whether or not
you can write to that file and can set a file to read-only.
Hint, use the "File" class.

*/

import java.io.*;
import java.util.Date;
import java.util.Scanner;

public class FileChecker {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
//      Check for file input from terminal.  commented out for now
//        if(args.length != 1) {
//            System.out.println("Checking file location for modification.");
//            return;
//        }
//        File x = new File(args[0]);

        // set file path to new file object
        File x = new File ("/Users/PopoPenguin/CodingNomads/Airline_Accidents.csv");

        // checks file for last modified date and converts long lastModified() to date object
        // output results
        Date lastModified = new Date(x.lastModified());
        System.out.println("File last modified: " + lastModified);

        // ask user for input to check file writable otherwise ends program.
        System.out.println("Would you like to check if this file is writable?");
        System.out.println("Enter 1 for yes or 2 for no.");
        //store input of command
        int command = input.nextInt();
        // if user chooses to check, performs check of writable and gives results of check
        if(command==1){
            if (x.canWrite()){      //if true will output result
                System.out.println("File is writable");
            } else {
                System.out.println("File is read-only");
            }
        }else {                     //if user chooses not to check writable, ends program
            System.out.println("Ok..Goodbye!!");
            return;
        }
        // Ask user for input to change read or write permission of file to read-only
        System.out.println("Do you wish to make file read-only?");
        System.out.println("Enter 1 for yes or 2 for no.");
        command = input.nextInt();
        // If user chooses, will set file to read only otherwise ends program
        if(command==1){
            x.setReadOnly();
            System.out.println("File is read-only");
        } else {
            System.out.println("Ok..Goodbye!!");
            return;
        }
    }
}
