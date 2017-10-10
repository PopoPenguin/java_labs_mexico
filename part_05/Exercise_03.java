package part_05;

/**
 * Write two classes. In Class_01 have a main method that creates on instance of Class_02. In Class_02, demonstrate
 * method overloading. You must overload a method a least 3 times. Each method should have a return type that is not
 * void. Within the main() (or a method of your choosing) in Class_01 call each overloaded method in Class_02.
 * Use System.out.println at various points to demonstrate the flow of execution. You can name these classes
 * whatever you want.
 */

class Exercise_03 {

    public static void main(String[] args) {

        Two_03 two = new Two_03();
        double volume;

        //overloaded methods with varying input for length width height and the appropriate

        volume=two.calcVolume(3,4,5);
        System.out.println("Volume is " + volume + " when length is int width is int height is int");

        volume=two.calcVolume(3.5,4.5,5.5);
        System.out.println("Volume is " + volume + " when length is double width is double height is double");

        volume=two.calcVolume(3,4.5,5.5);
        System.out.println("Volume is " + volume + " when length is int width is double height is double");

        volume=two.calcVolume(3.5,4,5.5);
        System.out.println("Volume is " + volume + " when length is double width is int height is double");

        volume=two.calcVolume(3.5,4.5,5);
        System.out.println("Volume is " + volume + " when length is double width is double height is int");

        volume=two.calcVolume(3,4,5.5);
        System.out.println("Volume is " + volume + " when length is int width is int height is double");

        volume=two.calcVolume(3.5,4,5);
        System.out.println("Volume is " + volume + " when length is double width is int height is int");

        volume=two.calcVolume(3,4.5,5);
        System.out.println("Volume is " + volume + " when length is int width is double height is int");


    }
}

class Two_03{

    private int length;
    private int height;
    private int width;


    //overloaded methods to calculate volume based on different inputs

    double calcVolume(int length, int width, int height) {
        double volume = (length * width * height);
        return volume;
    }

    double calcVolume(double length, double width, double height) {
        double volume = length * width * height;
        return volume;
    }

    double calcVolume(int length, double width, double height) {
        double volume = (double) length * width * height;
        return volume;
    }

    double calcVolume(double length, int width, double height) {
        double volume = length * (double) width * height;
        return volume;
    }

    double calcVolume(double length, double width, int height) {
        double volume = length * width * (double) height;
        return volume;
    }

    double calcVolume(int length, int width, double height) {
        double volume =(double) length * (double) width * height;
        return volume;
    }

    double calcVolume(double length, int width, int height) {
        double volume = length * (double) width * (double) height;
        return volume;
    }

    double calcVolume(int length, double width, int height) {
        double volume = length * width * height;
        return volume;
    }


}