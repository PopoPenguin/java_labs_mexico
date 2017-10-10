package part_05;

/**
 * Write two classes. Class_01 should have the main(). Class_02 should have various instance variables. At least one of
 * must be static. Within class_01 create at least 3 instances of class_02. Set the instance variables of class_02. Then,
 * just once, in one place, set the static instance variable in class_02. Afterwards, print out the value of each instance
 * variable and the static variable for each class.
 */

class Exercise_07{

    public static void main(String[] args) {

        //creating three instances of Two_07

        Two_07 one = new Two_07();
        Two_07 two = new Two_07();
        Two_07 three = new Two_07();

        System.out.println("Values of variable after object creation");

        //Retrieving each variable value of each object which should all be the same

        System.out.println("Variable values for object one is");
        System.out.println("x is " + one.getX() + " y is " + Two_07.y + " c is " + one.getC());

        System.out.println("Variable values for object two is");
        System.out.println("x is " + two.getX() + " y is " + Two_07.y + " c is " + two.getC());

        System.out.println("Variable values for object three is");
        System.out.println("x is " + three.getX() + " y is " + Two_07.y + " c is " + three.getC());

        System.out.println();
        System.out.println("Setting values for each object");

        //Setting new values for each variable for each object
        one.setX(1);
        one.setC('y');
        two.setX(2);
        two.setC('x');
        three.setX(3);
        three.setC('w');
        Two_07.y = ("Luke...I am your father!!");   //static value changed across all

        System.out.println();
        System.out.println();

        System.out.println("Variable values for object one is");
        System.out.println("x is " + one.getX() + " y is " + Two_07.y + " c is " + one.getC());

        System.out.println("Variable values for object two is");
        System.out.println("x is " + two.getX() + " y is " + Two_07.y + " c is " + two.getC());

        System.out.println("Variable values for object three is");
        System.out.println("x is " + three.getX() + " y is " + Two_07.y + " c is " + three.getC());



    }
}

class Two_07{

    private int x=0;
    static String y="I'm king of the world!!";
    private char c = 'Z';

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }


    public char getC() {
        return c;
    }

    public void setC(char c) {
        this.c = c;
    }
}