package part_10.traffic_light_upgrade;

/*
created by PopoPenguin on 10/25/17
*/

// Condensing Information to enumeration
public enum TrafficLightColor{
    RED(12000), GREEN(10000), YELLOW(2000);     // added delays associated to each color

    private int delay;                          // int delay

    TrafficLightColor (int delay){              // constructor for TrafficLightColor taking in Constant (values)
        this.delay=delay;                       //and associating it to delay
    }

    int getDelay(){                             // method to return delay value
        return delay;
    }
}
