// Program to find the power of a number
import java.util.Scanner;

class lv2_problem10_PowerOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input for the number and the power
        System.out.print("Enter the number: ");
        int number = input.nextInt();
        System.out.print("Enter the power: ");
        int power = input.nextInt();

        // Variable to store result, initially set to 1
        int result = 1;

        // Loop to calculate the power
        for (int i = 1; i <= power; i++) {
            result *= number;
        }

        // Print the result
        System.out.println(number + " raised to the power of " + power + " is " + result);

        // Close the Scanner
        input.close();
    }
}
