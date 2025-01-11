import java.util.Scanner;

class lv3_problem4_abundantNumber {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take input number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Variable to store the sum of divisors
        int sumOfDivisors = 0;

        // Loop to find divisors of the number
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                sumOfDivisors += i;  // Add divisor to sum
            }
        }

        // Check if the sum of divisors is greater than the number
        if (sumOfDivisors > number) {
            System.out.println(number + " is an Abundant number.");
        } else {
            System.out.println(number + " is not an Abundant number.");
        }

        // Close the scanner object
        input.close();
    }
}
