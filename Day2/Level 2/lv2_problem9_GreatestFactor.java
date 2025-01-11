// Program to find the greatest factor of a number (excluding the number itself)
import java.util.Scanner;

class lv2_problem9_GreatestFactor {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store greatest factor
        int greatestFactor = 1;

        // Loop from number-1 to 1
        for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) {
                greatestFactor = i;
                break; // Break after finding the greatest factor
            }
        }

        // Print the greatest factor
        System.out.println("The greatest factor of " + number + " (beside itself) is " + greatestFactor);

        // Close the Scanner
        input.close();
    }
}
