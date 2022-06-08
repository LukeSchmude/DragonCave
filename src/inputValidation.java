import java.util.Scanner;
public class inputValidation {

    public static boolean choiceValidation(String  playerChoice) {

        boolean valid;
        try {
            System.out.println(Integer.parseInt(playerChoice));
            valid = true;

        } catch (Exception e) {
            System.out.println("Please enter a valid number");
            valid = false;
        }

        return valid;
    }
}
