package part_09.queue;

/*
created by PopoPenguin on 10/24/17
*/


public class QueueController {

        public static void main(String[] args) {

            Queue test = new Queue(101);        //creating a new generic_queue of size 101

            try {
                for (int i = 0; i < test.size(); i++) {           //populating generic_queue incrementally from 0 to 100
                    test.put(i);                       //placing into the generic_queue
                }
            }
            catch (DataStructureFull full) {
                full.toString();
            }

            try {
                for (int i = 0; i <test.size(); i++){
                    if (i%2==0) {                       //test the position if it is first
                        System.out.println(test.get()); //if the value is first it will get the value and print out
                    } else if (i%2 !=0){                //test the position if it is alternating
                        test.get();                     //if it is the alternating input it will get the value but not
                    }                                   //print out

                }
            } catch (DataStructureEmpty empty){
                System.out.println(empty.toString());
            }


        }
}



