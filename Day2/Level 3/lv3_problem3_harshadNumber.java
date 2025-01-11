import java.util.Scanner;

class lv3_problem3_harshadNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store the sum of digits
        int sum = 0;
        int originalNumber = number;

        // Loop to extract each digit and add it to the sum
        while (number != 0) {
            sum += number % 10;  // Add last digit to sum
            number /= 10;  // Remove last digit
        }

        // Check if the number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            System.out.println(originalNumber + " is a Harshad number.");
        } else {
            System.out.println(originalNumber + " is not a Harshad number.");
        }

        // Close the scanner object
        input.close();
    }
}
