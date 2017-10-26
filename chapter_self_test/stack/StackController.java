package chapter_self_test.stack;

/*
created by PopoPenguin on 10/26/17
*/


import java.util.Scanner;

class StackController{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size = input.nextInt();
        System.out.println();
        StackTest test = new StackTest(size);

        test.pushLoc('a');
        test.pushLoc('b');
        test.pushLoc('c');
        test.pushLoc('d');
        test.pushLoc('e');


        for (int i =test.getLocation(); i>=0;i--) {

            test.popLoc();

        }

    }
}