// Create FactorialWhileLoop class to compute factorial using while loop
import java.util.Scanner;

class lv1_problem14_FactorialWhileLoop {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a positive integer: ");
        int n = input.nextInt();

        // Check if the number is positive
        if (n < 0) {
            System.out.println("The entered number is not a positive integer.");
        } else {
            // Compute factorial using while loop
            int factorial = 1;
            int i = 1;
            while (i <= n) {
                factorial *= i;
                i++;
            }

            // Print the factorial
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        // Close the Scanner
        input.close();
    }
}
