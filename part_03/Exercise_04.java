package part_03;
import java.util.Scanner;



/**

 Code a "Rock Paper Scissors" Game

 */

public class Exercise_04 {

    public static void main(String[] strings) {


        // generate a random number >= 0 and <= 3
        int computerHand = 0 + (int) (Math.random() * (3 - 0));

        // use this as the computer's hand
        int playerHand;

        do {
            Scanner input = new Scanner(System.in);
            System.out.print("Enter 0 for scissor, 1 for rock, 2 for paper: ");
            playerHand = input.nextInt();
        } while (playerHand <=0 || playerHand >=3 );

        // call getHand(int hand) to determine the computers hand
        String compHand = getHand(computerHand);

        // call getHand(int hand) to determine the players hand
        String playHand = getHand(playerHand);

        // call determineWinner(int computerHand, int playerHand) to determine who one
        String results = determineWinner(computerHand,playerHand);


        // print out a message to the console stating which hand the computer had, which hand
        // the play had and who won.

        System.out.println("Computer throws " + compHand + ":  Player throws " + playHand);
        System.out.println(results);


    }
        //method to take in an interger and associated a handsign to that interger

    public static String getHand(int hand) {
        String handSign = "";
        switch (hand) {
            case 0:
                handSign = "Scissor";
                break;
            case 1:
                handSign = "Rock";
                break;
            case 2:
                handSign = "Paper";
                break;
        }

        // use a switch statement to determine each players hand
        // 0 = scissor, 1 = rock, 2 = paper

        // return hand
        return handSign;
    }

        //method to determine who the winner is based on boolean conditions

        public static String determineWinner(int computer, int player) {

        String status = "";
        // if computer and player do not equal will determine the conditions of who won
        if (player !=computer) {

            switch (player) {
                // use conditional ("?") operator
                case 0:
                    status = (computer != 1) ? "You won!" : "You lost :(";
                    break;
                // implement the two remaining cases
                case 1:
                    status = (computer != 2) ? "You won!" : "You lost :( ";
                    break;
                case 2:
                    status = (computer != 0) ? "You Won!" : "You lost :(";
                    break;
            }
            //if computer and player are equal will output a tie
        } else status = "You tied";

        // return status
            return status;
    }
}