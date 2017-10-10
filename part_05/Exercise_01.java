package part_05;

/**
 * Write three classes. The Class_01 should contain the main method. The main method should create an instance
 * of Class_02. Class_02 must have several private instance variables. Use Class_01 to set the variables in Class_02.
 * Within Class_02, create an instance of Class_03, which must also have several private variables. Use Class_02 to set
 * the private variables within Class_03. Please note, do not use the constructor of any of these classes to set the
 * private instance variables. Use System.out.println at various points to demonstrate the flow of execution and
 * the varying state of each private variable. You may name these classes whatever you like.
 */

class Exercise_01{

    public static void main(String[] args) {

        System.out.println("Start of code");
        System.out.println("Creating new object of Two_01");
        Two_01 two = new Two_01();
        System.out.println("Variables of Two_01 before Setting");
        System.out.println("x = " + two.getX());
        System.out.println("y = " + two.getY());
        System.out.println("z = " + two.getZ());

        System.out.println("Creating new object of Three_01");
        Three_01 three = new Three_01();
        System.out.println("Executing main method of Three_01 of object three");
        three.main();

        System.out.println("Setting variables of Two_01 in Class_01");
        two.setX(8);
        System.out.println("two.x = " + two.getX());
        two.setY("Happy");
        System.out.println("two.y = " + two.getY());
        two.setZ(1.25);
        System.out.println("two.z = " + two.getZ());

        System.out.println("Executing main method of Two_01 of object two");
        two.main();


    }
}

class Two_01{
    private int x=0;
    private String y="Sad";
    private double z= 2.5;


    public void main () {
        System.out.println("Inside Two_01");
        System.out.println("Creating object of Three_01 within Two_01");
        Three_01 three = new Three_01();
        System.out.println("Variables of Three_01 before Setting");
        System.out.println("a = " + three.getA());
        System.out.println("b = " + three.getB());
        System.out.println("c = " + three.getC());

        System.out.println("Setting variables of Three_01");
        three.setA(5);
        System.out.println("A inside class 02 method = " + three.getA());

        three.setB(15);
        System.out.println("B inside class 02 method = " +three.getB());

        three.setC(25);
        System.out.println("C inside class 02 method = " + three.getC());

        System.out.println(" X inside Class two = " + getX());
        System.out.println(" Y inside Class two = " + getY());
        System.out.println(" Z inside Class two = " + getZ());

        System.out.println("Executing main method of Three_01 of object three");
        three.main();



    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getY() {
        return y;
    }

    public void setY(String y) {
        this.y = y;
    }

    public double getZ() {
        return z;
    }

    public void setZ(double z) {
        this.z = z;
    }


}

class Three_01{
    private int a = 10;
    private int b = 100;
    private int c = 1000;

    public void main (){

        System.out.println("a inside Class 03 = " + getA());

        System.out.println("b inside Class 03 = " + getB());

        System.out.println("c inside Class 03 = " + getC());


    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }




}
