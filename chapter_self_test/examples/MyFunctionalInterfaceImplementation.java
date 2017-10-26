package chapter_self_test.examples;

/*
created by PopoPenguin on 10/26/17
*/


public class MyFunctionalInterfaceImplementation implements MyFunctionalInterface{


    @Override
    public double someFunction(double a, double b) {
        return Math.pow(a,b);
    }
}
