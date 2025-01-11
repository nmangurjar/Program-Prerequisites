import java.util.Scanner;

class lv3_problem1_armstrongNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Store the original number to compare later
        int originalNumber = number;
        
        // Variable to store the sum of cubes of digits
        int sum = 0;

        // Loop to extract each digit and calculate the cube of each digit
        while (number != 0) {
            // Extract last digit
            int digit = number % 10;

            // Calculate cube of digit and add it to sum
            sum += digit * digit * digit;

            // Remove last digit
            number /= 10;
        }

        // Check if the sum is equal to the original number
        if (sum == originalNumber) {
            System.out.println(originalNumber + " is an Armstrong number.");
        } else {
            System.out.println(originalNumber + " is not an Armstrong number.");
        }

        // Close the scanner object to prevent resource leak
        input.close();
    }
}
