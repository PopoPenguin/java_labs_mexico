package part_10.traffic_light_upgrade;

/*
created by PopoPenguin on 10/25/17
*/

// create a class TrafficLightSimulator thread

public class TrafficLightSimulator implements Runnable{

    private Thread thrd;                            // creates an object of Thread
    private TrafficLightColor tlc;                  // creates an object of enum TrafficLightColor
    boolean stop = false;                           // sets stop to false
    boolean changed = false;                        // sets changed to false

    TrafficLightSimulator (TrafficLightColor init){ // creates a constructor if given a String value
        tlc = init;                                 // assigns value given in constructor
        thrd = new Thread(this);             // creates a new thread of this constructor
        thrd.start();                               // starts thread when created
    }

    TrafficLightSimulator() {                       // creates a constructor if no value is given for color
        tlc = TrafficLightColor.RED;                // assigns value to red by default
        thrd = new Thread(this);             // creates a new thread of this constructor
        thrd.start();                               // starts thread when created

    }

    @Override
    public void run() {
        while (!stop) {                             // while thread not stopped
            try {
                Thread.sleep(tlc.getDelay());       // gets delay value associated to color of traffic light and
            } catch (InterruptedException ie){      // puts thread to sleep for that delay value
                System.out.println(ie);             // catches exception if thrown
            }
            changeColor();                          // once delay has completed executes change color method
        }
    }

    synchronized void changeColor(){                // synchronized method to avoid changeColor and waitForChange

        switch (tlc){                               // switch statement to tell what next color is depending on current
            case RED:                               // color of tlc
                tlc = TrafficLightColor.GREEN;
                break;
            case YELLOW:
                tlc = TrafficLightColor.RED;
                break;
            case GREEN:
                tlc = TrafficLightColor.YELLOW;
        }

        changed = true;                             // once color has changed, sets changed to true
        notify();                                   // notify exiting of synchronized method
    }

    synchronized void waitForChange() {             // synchronized method waiting until notified
        try{
            while(!changed)                         // while true will continue to wait
                wait();                             // once false will set changed to false
            changed = false;
        } catch (InterruptedException ie) {
            System.out.println(ie);
        }
    }

    synchronized TrafficLightColor getColor(){

        return tlc;                                 // return TrafficLightColor
    }

    synchronized void cancel (){

        stop = true;                                // when cancel method called will set stop to true
    }
}

