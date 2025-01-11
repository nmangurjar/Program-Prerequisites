// Program to find the factors of a number
import java.util.Scanner;

class lv2_problem11_FactorsOfNumber {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Print factors of the number
        System.out.println("Factors of " + number + " are:");
        for (int i = 1; i < number; i++) {
            if (number % i == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner
        input.close();
    }
}
