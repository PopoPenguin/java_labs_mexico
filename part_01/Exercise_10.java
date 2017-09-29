package part_01;

/**
 * Part 1 Exercise 10:
 *
 *      If a runner runs 12 kilometers in 30 minutes and 30 seconds. What is his/her average speed
 *      in miles per hour. (Tip: 1 mile = 1.6 km)
 *
 */
public class Exercise_10 {

    public static void main(String[] args) {
        double mph ;
        double dist = 12;
        double min = 30;
        double sec = 30;
        double hour ;
        double mile ;
        mile = dist / 1.6 ;
        hour = (min / 60) + (sec/60/60);
        mph = mile/hour;
        System.out.println("Runner running 12 kilometers in 30 minutes and 30 seconds will have a");
        System.out.println("mph of " + mph);
    }

}
