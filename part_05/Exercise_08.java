package part_05;

/**
 * Write one class. This class must make use of an inner/nested class. Within the nested class, access the instance variables
 * of the outer class. Also, within the inner class, call at least two methods that have a return type of int. Add these
 * two ints together and set a final instance variable in the outer with this value.
 */

class Exercise_08 {

    //class variables
    int x =10;
    int y = 100;
    int sum;

    public static void main(String[] args) {


        Exercise_08 a = new Exercise_08();  //creating object of Exercise_08 class
        Inner inside = a.getInner();        //creating object of Inner using outer method

        System.out.println("Sum of outer variable is " + inside.sum());
        System.out.println("Dividend of outer variable is " + inside.divide());
        a.sum = inside.sum() + inside.divide();     //assigning the sums of the two methods to outer class variable
        System.out.println("Sum of sum and divid is " + a.sum);

    }

    private void sayHi(){
        System.out.println("hi");
    }

    //method to create an object of inner
    private Inner getInner(){
        return new Inner();
    }

    //inner class
    class Inner {


        //method to calculate sum of x and y
        int sum(){
            sayHi();
            return x + y;
        }

        //method to calculate dividend of x and y
        int divide () {
            return y / x;
        }

    }
}