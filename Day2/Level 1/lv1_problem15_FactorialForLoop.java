// Create FactorialForLoop class to compute factorial using for loop
import java.util.Scanner;

class lv1_problem15_FactorialForLoop {
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
            // Compute factorial using for loop
            int factorial = 1;
            for (int i = 1; i <= n; i++) {
                factorial *= i;
            }

            // Print the factorial
            System.out.println("The factorial of " + n + " is: " + factorial);
        }

        // Close the Scanner
        input.close();
    }
}
