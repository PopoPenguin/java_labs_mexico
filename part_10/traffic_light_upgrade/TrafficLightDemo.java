package part_10.traffic_light_upgrade;

/*
created by PopoPenguin on 10/25/17
*/


public class TrafficLightDemo {
    public static void main(String[] args) {
        TrafficLightSimulator t1 = new TrafficLightSimulator(TrafficLightColor.GREEN);

        for (int i = 0; i <9; i++) {        // loops 9 times
            System.out.println(t1.getColor());  // prints out the color of the thread
            t1.waitForChange();             // executes waitForChange() for first thead
        }
        t1.cancel();                        // once method is called will stop thread
    }
}
