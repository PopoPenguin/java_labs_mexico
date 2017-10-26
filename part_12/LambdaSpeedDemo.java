package part_12;

/**
 * Created by ryandesmond on 10/12/17.
 */
public class LambdaSpeedDemo {

    public static void main(String[] args) {

        /*
        Below is an anonymous inner class - that implements the Traditional Interface
         */
        long startAnon = System.currentTimeMillis();
        TraditionInterface trad = new TraditionInterface() {
            @Override
            public int run(int numLoops) {
                int num = 0;
                for(int i = 0; i < numLoops; i++){
                    num += i;
                }
                return num;
            }
        };

        int sum = trad.run(1000000);
        long endAnon = System.currentTimeMillis();
        System.out.println("Anonymous class time = " + (endAnon - startAnon) + " milliseconds");
        // END anonymous inner class


        /*
        Below is a lambda expression that does the same exact work as the anonymous inner class above
         */
        long startLambda = System.currentTimeMillis();

        TraditionInterface numL = (n) -> {
            int num = 0;
            for(int i = 0; i < n; i++){
                num += i;
            }
            return num;
        };

        numL.run(1000000);
        long endLambda = System.currentTimeMillis();
        System.out.println("Lambda expression time = " + (endLambda - startLambda) + " milliseconds");
        // END Lambda


        /*
        Below is the traditional interface implementation (including class below) that does the same exact
        work as the anonymous inner class and lambda expression
         */
        long startInter = System.currentTimeMillis();
        InterFaceImpl test = new InterFaceImpl();
        int x = test.run(1000000);
        long endInter = System.currentTimeMillis();
        System.out.println("Interface implementation = " + (endInter - startInter) + " milliseconds");
    }

}

class InterFaceImpl implements TraditionInterface{
    @Override
    public int run(int numLoops) {
        int num = 0;
        for(int i = 0; i < numLoops; i++){
            num += i;
        }
        return num;
    }
}
