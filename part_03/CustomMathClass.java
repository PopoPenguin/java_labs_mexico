package part_03;

public class CustomMathClass {

    public static final double PI = 3.14159265359;

    public static double add (double a, double b){
        return a + b;
    }

    public static double subtract (double a, double b) {
        return a - b;
    }

    public static double multiply (double a, double b) {
        return a * b;
    }

    public static double divide (double a, double b) {
        return a/b;
    }

    public static double random (double low, double high){
        return low + Math.random() * ((high - low) + 1);
    }

}
