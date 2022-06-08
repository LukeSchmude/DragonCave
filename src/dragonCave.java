import java.util.Random;
import java.util.Scanner;

public class dragonCave {
    public static void main(String[] args) {

        //RANDOM NUMBER GENERATOR OBJECT
        Random rand = new Random();

        //CREATING RANDOM OUTCOME
        int upperbound = 1 + 1; // did zero to one and added one to make it 1 or 2
        int int_random = rand.nextInt(upperbound);


        //USER INPUT OBJECT
        Scanner player = new Scanner(System.in);


        //KEEP ASKING USER FOR VALID RESPONSE
        boolean valid = false;
        String string_input = "";
        while (!valid) {
            System.out.println("Please enter a number (1 or 2)");
            string_input = player.nextLine(); // players choice
            valid = inputValidation.choiceValidation(string_input );
        }

        int playerChoice = Integer.parseInt(string_input);

        //USER DID NOT CHOOSE 1 OR 2
        if(playerChoice != 1 || playerChoice != 2)
        {
            System.out.println("\nThe queen of the village deemed you indecisive and chose an option for you...");
        }


        if (playerChoice == int_random) {
            //SAFE
            System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! He opens his jaws and...\nGobbles you down in one bite!");

        } else {
            //DIE
            System.out.println("You approach the cave...\nIt is dark and spooky...\nA large dragon jumps out in front of you! He opens his jaws and...\nWelcomes you to share his treasure");
            }

        }
    }


