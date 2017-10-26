package part_11.generic_queue;

/*
created by PopoPenguin on 10/24/17
*/


public class QueueController {

        public static void main(String[] args) {

            //Example of creating a Character queue
            GenericQueue charQueue = new GenericQueue();      //creating a new generic_queue array list called charQueue
            Character input = 'a';                       //creating a Character variable input  = 'a'

            try {
                for (int i = 0; i < 26; i++) {           //populating generic_queue incrementally from 0 to 100
                    charQueue.put(input++);                   //placing into the generic_queue
                }
            } catch (DataStructureFull full) {            // catch Exception when generic_queue is full
                full.toString();
            }

            while (charQueue.hasNext()) {                //output value of queue Characters
                try {
                    System.out.println(charQueue.get());        //printout the value of next value
                } catch (DataStructureEmpty dataStructureEmpty) {
                    dataStructureEmpty.printStackTrace();
                }


            }


            //Example of generating a generic queue using custom objects cars

            GenericQueue<Car> cars = new GenericQueue();
            //Creating new objects of cars
            Car toyota = new Car("Toyota","4Runner");
            Car nissan = new Car("Nissan", "Xterra");
            Car lambo = new Car( "Lamborghnini", "Fancy");

            //Adding values to generic queue cars
            try{
                cars.put(toyota);
                cars.put(nissan);
                cars.put(lambo);
            }catch (DataStructureFull e){
                e.toString();
            }
            //Running method showCars to get values from queue cars
            showCars(cars);

        }

        public static <T extends Car> void showCars(GenericQueue<T> cars){
            // default empty Car to use while we loop (so we don't create all kinds of them)
            Car nextCar;
            // if there are more cars to show in the Queue
            while (cars.hasNext()){
                try {
                    //nextCar gets the next Car in the queue
                    nextCar=cars.get();
                    //print out the car variables
                    System.out.println(nextCar.make + " " + nextCar.model+ "!");

                } catch (DataStructureEmpty dataStructureEmpty) {
                    dataStructureEmpty.printStackTrace();
                }
            }

            System.out.println("No more cars to show.");

        }


}



