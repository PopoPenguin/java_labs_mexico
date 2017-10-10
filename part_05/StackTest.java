package part_05;
import java.util.Scanner;
import java.util.Stack;

public class StackTest {
    private char[] ch;
    private int location ;

    StackTest (int a){
        ch = new char[a];
        location = 0;
    }

    public void pushLoc(char input) {
        if (location == ch.length) {
            System.out.println("Stack is full");
            return;
        }
        ch[location++] = input;

    }

    public char popLoc() {
        if (location==0) {
            System.out.println("Stack Empty");
            return '-';
        }else if(location!=0) {
            return ch[location--];
        }

        return '-';

    }
}




class StackDemo{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter size of stack");
        int size = input.nextInt();

        StackTest test = new StackTest(size);

        test.pushLoc('a');
        test.pushLoc('b');
        test.pushLoc('c');

        for (int i = size-1; i>=0;i--) {
            char y = test.popLoc();
            System.out.println(y);
        }

    }
}
