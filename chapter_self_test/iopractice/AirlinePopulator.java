package chapter_self_test.iopractice;

/*
created by PopoPenguin on 10/19/17
*/


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class AirlinePopulator {

    ArrayList<Airline> populate (){

        String nextLine;

        ArrayList<Airline> resultList = new ArrayList();
        String file = "/Users/PopoPenguin/CodingNomads/Airline_Accidents.csv";

        // Create and use a FileReader wrapped in a BufferedReader - file argument is for a path to a file
        // the line below is using "try-with-resources to automatically open and close the file"
        try (BufferedReader br = new BufferedReader(new FileReader(file)))
        {
            while((nextLine = br.readLine()) != null) {
                Airline data = new Airline();
                String[] vals = nextLine.split(",");
                try {
                    data.setAirline(vals[0]);
                    data.setIncidents_85_99(Integer.parseInt(vals[1]));
                    data.setFatal_accidents_85_99(Integer.parseInt(vals[2]));
                    data.setFatalities_85_99(Integer.parseInt(vals[3]));
                    data.setIncidents_00_14(Integer.parseInt(vals[4]));
                    data.setFatal_accidents_00_14(Integer.parseInt(vals[5]));
                    data.setFatalities_00_14(Integer.parseInt(vals[6]));

                } catch (NumberFormatException e){
                    System.out.println("Number Format issue caught " + e);
                }


                resultList.add(data);

            }

        } catch(IOException exc) {
            System.out.println("I/O Error: " + exc);
        }
        return resultList;
    }

}
