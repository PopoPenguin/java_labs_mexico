package part_03;

import java.util.Scanner;

class Exercise_06 {

    // the goal of this method is to print out the local time in any given timezone
    public static void main(String[] strings) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the time zone offset to GMT (ie, -8 or 8): ");
        long timeZoneChange = input.nextInt();

        // Get total milliseconds since midnight, 1/1/1970
        long totalMilliseconds = System.currentTimeMillis();

        // Get total seconds since midnight, 1/1/1970
        long totalSeconds = totalMilliseconds/1000;
        System.out.println(totalSeconds + " is total seconds");

        // Get the current second within the minute within the hour
         long currentSecond= totalSeconds % 60;
        System.out.println(currentSecond + " is current seconds");

        // Get total minutes
        long totalMinutes = totalSeconds / 60;
        System.out.println(totalMinutes + " is total minutes");

        // Get the current minute in the hour
        long currentMinutes = totalMinutes % 60;
        System.out.println(currentMinutes + " is current minutes");
        // Get the total hours
        long totalHours = totalMinutes / 60;
        System.out.println(totalHours + " total hours");

        // Get the current hour
        long currentHour = totalHours % 24;
        System.out.println(currentHour + " is current hour");

        // Display results using a 12 hour clock, include AM or PM
        int counter = 0;

        //adjusts currentHour for the timezone and adjusts for new 24 hr range
        long adjustedHour = (currentHour + timeZoneChange)%24;

        //if hour is greater than 12 then adjusts time to a 12 hr range and increments counter for am to pm
        if (adjustedHour > 12){
            adjustedHour = adjustedHour -12;
            counter= 1;
        }
        // sets the string amPm to either AM or PM if counter is equal to zero or not
        String amPm = (counter == 0)? "AM" : "PM";

        System.out.println(adjustedHour +  " hours " + currentMinutes  + " minutes "+ amPm);
    }
}
