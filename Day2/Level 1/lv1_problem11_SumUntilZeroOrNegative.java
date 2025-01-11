// Create SumUntilZeroOrNegative class to compute sum until 0 or negative number is entered
import java.util.Scanner;

class lv1_problem11_SumUntilZeroOrNegative {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Initialize sum variable to store the cumulative total
        double sum = 0.0;

        // Infinite loop to get input and process it
        while (true) {
            // Prompt the user for input
            System.out.print("Enter a number (0 or negative to stop): ");
            double userInput = input.nextDouble();

            // Check if the user entered 0 or a negative number
            if (userInput <= 0) {
                break;
            }

            // Add the valid number to sum
            sum += userInput;
        }

        // Print the final sum
        System.out.println("The total sum of numbers is: " + sum);

        // Close the Scanner
        input.close();
    }
}
