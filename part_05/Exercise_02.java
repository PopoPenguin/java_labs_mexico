package part_05;

/**
 * Write two classes. In Class_01 (which contains the main()) create an instance of Class_02 and pass that instance
 * to a method_01 within Class_01. Within method_01 you must manipulate several private instance variables within
 * Class_02. Then, from within method_01, pass the instance of Class_02 to a new method, method_02. Within method_02
 * modify the instance variables of Class_02 once again. Use System.out.println at various points to demonstrate the
 * flow of execution and the varying state of each private variable. You can name these classes whatever you want.
 *
 */

class Exercise_02 {

    public static void main(String[] args) {

        Two_02 two = new Two_02();              //creating object of class Two_02
        Exercise_02 one = new Exercise_02();    //creating object of class ArraySwitchPos

        one.method_01(two);                     //running method_01 of ArraySwitchPos



    }



    void method_01(Two_02 obj){

        System.out.println("x y z before manipulation is ");
        //using getter to retrieve private values of class Two_02
        System.out.println((obj.getX() + " " + obj.getY() + " " + obj.getZ()));
        //calculating values based on variables
        int sum = obj.getX() + obj.getY() + obj.getZ();
        double product = (double) (obj.getY()*obj.getY()*obj.getZ());
        double avg = (double) (sum/3);

        System.out.println("Sum is " + sum  + " product is " + product + " average is " + avg);

        System.out.println("Setting x y z to sum div and avg");
        //using setters to assign new values to xyz
        obj.setX(sum);
        obj.setY((int)product);
        obj.setZ((int)avg);


        System.out.println("New values of x y z are ");
        //using getters to retrieve new values of private variables
        System.out.println(obj.getX() + " " + obj.getY() + " " + obj.getZ());

        System.out.println("Passing object through method_02");
        //executing method_02 and passing the object as the parameter
        method_02(obj);

    }
    void method_02(Two_02 obj){
        System.out.println("x y z for class Two_02 at start of method_02 are");
        System.out.println(obj.getX() + " " + obj.getY() + " " + obj.getZ());
        System.out.println("Adding one to x y z now gives new values as");
        obj.setX(obj.getX() + 1);
        obj.setY(obj.getY() + 1);
        obj.setZ(obj.getZ() + 1);
        System.out.println("x y z is now " );
        System.out.println(obj.getX()+ " " + obj.getY() + " " + obj.getZ());


    }




}

class Two_02{
    private int x = 2;
    private int y = 4;
    private int z = 6;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public int getZ() {
        return z;
    }

    public void setZ(int z) {
        this.z = z;
    }
}

