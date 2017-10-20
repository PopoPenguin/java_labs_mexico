package chapter_self_test;

/*
created by PopoPenguin on 10/19/17
*/


public class ThrowPractice {

    public static void main(String[] args) {

        System.out.println("Catching throw");

        try {
            int value = testMethod(6, 4);
            System.out.println(value);

        } catch (ArithmeticException e) {
            System.out.println("Caught Aritmetic Exception " + e);
        }
    }


    public static int testMethod(int a, int b) throws ArithmeticException {

        int x = a;
        int y = b;
        if (x / y != 0) {
            return x / y;

        } else {
            throw new ArithmeticException();
        }
    }
}
