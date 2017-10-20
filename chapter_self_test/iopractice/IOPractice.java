package chapter_self_test.iopractice;

/*
created by PopoPenguin on 10/19/17



Find a .csv data file of your choosing. I highly recommend Data.World (https://data.world/)
Download that file to your computer. I'd suggest putting it in a subdirectory of your
CodingNomads directory. Write an application that will use a BufferedReader to read this file
line by line. With each line that the BufferedReader reads, instantiate a corresponding POJO.
Add each POJO into an arraylist (code below). Once the whole .csv file is read and all objects are
created and residing in an arraylist, please loop through the arraylist and perform a function of your
choosing. You can print out the values of the objects, or iterate through them and perform some arithmetic
to find averages or totals of values, etc. The end goal is to get each row of the csv file
into a corresponding Java object. Once we have that data as objects the sky is the limit on what we can do! :)
    Example: if your CSV file looks like this: (for now, let's delete the first line of the file if
    it includes the column headers, as seen below)
    first_name,last_name,birthplace,age
    ryan,desmond,medford,35
    kim,desmond,toronto,32
    ...


*/
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils;

import java.io.*;
import java.lang.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.io.IOException;


public class IOPractice {

    public static void main(String[] args) throws IOException {


        AirlinePopulator fill = new AirlinePopulator();
        ArrayList<Airline> x = fill.populate();
        int sumOfFatalities = 0;
        for (Airline newData : x) {
            sumOfFatalities += newData.getFatalities_85_99() + newData.getFatalities_00_14();
            newData.compile();
        }

        System.out.println("Total sum of fatalities from 1985 - 2014 " + sumOfFatalities);


    }
}
