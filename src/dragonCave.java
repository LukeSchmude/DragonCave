import java.util.InputMismatchException;
import java.util.Random;
import java.util.Scanner;

public class dragonCave {
    public static void main(String[] args) {
        Random rand = new Random();
        int upperbound = 1 + 1; // did zero to one and added one to make it 1 or 2
        int int_random = rand.nextInt(upperbound);


        System.out.println("You are in a land full of dragons. \nIn front of you, you see two caves." +
                "\nIn one cave, the dragon is friendly and will \nshare his treasure with you. The other" +
                "\ndragon is greedy and hungry and will eat you on sight. \nWhich cave will you go into?");

        Scanner player = new Scanner(System.in);
        System.out.println("(1 or 2)");

        int playerChoice = 0;
        try {
            playerChoice = player.nextInt();
            System.out.println(playerChoice);
        } catch (InputMismatchException ex) {
            System.out.println("Please enter a number");
        }

        if (playerChoice == int_random) {
            System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! He opens his jaws and...\nGobbles you down in one bite!");

        } else {
            System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! He opens his jaws and...\nWelcomes you to share his treasure");

        }
    }
}


