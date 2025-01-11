import java.util.Scanner;

class lv3_problem2_countDigits {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store the count of digits
        int count = 0;

        // Loop to count the number of digits
        while (number != 0) {
            count++;  // Increment digit count
            number /= 10;  // Remove last digit
        }

        // Display the result
        System.out.println("The number of digits is: " + count);

        // Close the scanner object
        input.close();
    }
}
