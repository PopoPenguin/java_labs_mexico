package part_08;

import java.util.Scanner;

public class Controller {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);             //initiate scanner
        System.out.println("Enter size of stack/generic_queue");    //request an input from user to set size of generic_queue and stack
        int size = input.nextInt();                         //storing input into variable size
        System.out.println();
        Stack test = new Stack(size);                       //creating object of Stack with size given by user

        char ex = 'a';                                      //creating an incrementing char for Stack

        while (true){                                       //while true will place values into stack and increment by 1
            try {                                           //try and catch custom error for DataStructureFull
                test.push((ex++));
            } catch (DataStructureFull e) {
                System.out.println(e.toString());           //outputting Exception method to describe error
                break;
            }
        }


        for (int i =test.getLocation(); i>=0;i--) {         //outputting results of Stack until Stack is empty

            try {
                test.pop();                                 //try and catching error of DataStructureEmpty
            } catch (DataStructureEmpty e) {
                System.out.println(e.toString());
            }

        }
    }
}
