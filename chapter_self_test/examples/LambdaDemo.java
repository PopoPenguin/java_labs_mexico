package chapter_self_test.examples;

/*
created by PopoPenguin on 10/26/17
*/


public class LambdaDemo {

    public static void main(String[] args) {

        demonstrateLambda(45,78);
        demonstrateAnonInnerClass(45,78);
        demonstrateTraditionImplementation(45,78);
    }

    public static void demonstrateLambda(double a, double b){
        MyFunctionalInterface lambdaLambdaLambda = (n,m)-> {

            return Math.pow(n,m);
        };

        double powerVal = lambdaLambdaLambda.someFunction(a,b);
        System.out.println(powerVal);
    }

    public static void demonstrateAnonInnerClass(double a, double b){

        MyFunctionalInterface anonDemo = new MyFunctionalInterface() {

            @Override
            public double someFunction(double n, double m) {
                return Math.pow(n,m);
            }
        };

        double powerVal = anonDemo.someFunction(a,b);
        System.out.println(powerVal);


    }

    public static void demonstrateTraditionImplementation (double a, double b){

        MyFunctionalInterfaceImplementation obj =  new MyFunctionalInterfaceImplementation();
        double powerVal = obj.someFunction(a,b);
        System.out.println(powerVal);


    }


}
