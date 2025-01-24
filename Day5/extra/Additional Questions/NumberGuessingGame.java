import java.util.Scanner;
import java.util.Random;

 class NumberGuessingGame {

    // Function to generate a random guess within the given range
    public static int generateGuess(int lower, int upper) {
        Random random = new Random();
        return random.nextInt(upper - lower + 1) + lower;
    }

    // Function to get feedback from the user about the guess
    public static String getFeedback() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Is the guess High: H, Low L, or Correct: C?");
        return scanner.nextLine().toUpperCase();
    }

    // Function to get the user's number
    public static int getUserNumber() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please think of a number between 1 and 100.");
        System.out.println("To help me guess, enter your number below (this will not be shown in the game, just for reference): ");
        return scanner.nextInt();
    }

    // Main function to drive the game
    public static void playGame() {
        int lower = 1;
        int upper = 100;
        int userNumber = getUserNumber();  // Get user's number
        int guess;
        String feedback;

        System.out.println("Now I will try to guess your number.");

        while (true) {
            guess = generateGuess(lower, upper);  // Generate a random guess
            System.out.println("Is your number " + guess + "?");

            feedback = getFeedback();  // Get user feedback

            if (feedback.equals("C")) {
                System.out.println("Yay! I guessed your number correctly.");
                break;
            } else if (feedback.equals("H")) {
                upper = guess - 1;  // Guess is too high, adjust the upper range
            } else if (feedback.equals("L")) {
                lower = guess + 1;  // Guess is too low, adjust the lower range
            } else {
                System.out.println("Invalid input! Please enter H, L, or C.");
            }
        }
    }

    // Main method
    public static void main(String[] args) {
        playGame();  // Start the game
    }
}
