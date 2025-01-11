// Create SumOfNaturalNumbers class to compute the sum of natural numbers
import java.util.Scanner;

class lv1_problem12_SumOfNaturalNumbers {
    public static void main(String[] args) {
        // Create a Scanner Object
        Scanner input = new Scanner(System.in);

        // Get user input for the number
        System.out.print("Enter a natural number: ");
        int n = input.nextInt();

        // Check if the number is a natural number
        if (n <= 0) {
            System.out.println("The entered number is not a natural number.");
        } else {
            // Compute the sum using the formula
            int formulaSum = n * (n + 1) / 2;

            // Compute the sum using a while loop
            int loopSum = 0, i = 1;
            while (i <= n) {
                loopSum += i;
                i++;
            }

            // Print results and compare
            System.out.println("Sum using formula: " + formulaSum);
            System.out.println("Sum using while loop: " + loopSum);
        }

        // Close the Scanner
        input.close();
    }
}
