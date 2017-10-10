package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 must have 3 or more private variables. Class_02 must
 * also have at least 3 overloaded constructors. In Class_01.main() create several instances of Class_02 using each
 * overloaded constructor. Each constructor should do something slightly differently. Class_02 must have at least
 * two private instance variables. Using the various instances of Class_02 that you now have in Class_01, call a method
 * within each instance of Class_02 to modify Class_02's private instance variables.
 *
 */

class Exercise_04 {


    public static void main(String[] args) {

        //creating three instances of class Two_04 based on parameters passed through

        Two_04 one = new Two_04(1);
        Two_04 two = new Two_04(1,2);
        Two_04 three = new Two_04(1,2, 3);

        System.out.println("Now setting private instance variables manually");

        one.setX(15);
        two.setArea(30);
        three.setVolume(5);

        //retrieving values using getter

        System.out.println("one area is " + one.getX());
        System.out.println("two volume is " + two.getArea());
        System.out.println("three x is " + three.getVolume());



    }




}

class Two_04{

    private int x;
    private int area;
    private int volume;

    //overloading constructor to create different objects depending on parameters entered

    public Two_04(int x) {
        this.x = -x;
        System.out.println("x is " + this.x);
    }

    public Two_04(int x, int y) {
        area = x * y;
        System.out.println("area of x and y is " + area);
    }

    public Two_04(int x, int y, int z) {
        volume = x * y * z;
        System.out.println("volume of x y and z is  " + volume);
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getArea() {
        return area;
    }

    public void setArea(int area) {
        this.area = area;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }
}