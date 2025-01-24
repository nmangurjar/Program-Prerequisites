import java.util.Scanner;

public class BasicCalculator {

    // Function to add two numbers
    public static double add(double num1, double num2) {
        return num1 + num2;
    }

    // Function to subtract two numbers
    public static double subtract(double num1, double num2) {
        return num1 - num2;
    }

    // Function to multiply two numbers
    public static double multiply(double num1, double num2) {
        return num1 * num2;
    }

    // Function to divide two numbers
    public static double divide(double num1, double num2) {
        if (num2 != 0) {
            return num1 / num2;
        } else {
            System.out.println("Error! Division by zero.");
            return Double.NaN; // Return "Not a Number" for invalid division
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Basic Calculator");
        System.out.println("Select operation:");
        System.out.println("1. Addition");
        System.out.println("2. Subtraction");
        System.out.println("3. Multiplication");
        System.out.println("4. Division");
        
        System.out.print("Enter the number of the operation (1/2/3/4): ");
        int choice = scanner.nextInt();

        // Ask for two numbers
        System.out.print("Enter the first number: ");
        double num1 = scanner.nextDouble();
        
        System.out.print("Enter the second number: ");
        double num2 = scanner.nextDouble();

        // Perform the selected operation
        double result = 0;
        switch (choice) {
            case 1:
                result = add(num1, num2);
                System.out.printf("%.2f + %.2f = %.2f%n", num1, num2, result);
                break;
            case 2:
                result = subtract(num1, num2);
                System.out.printf("%.2f - %.2f = %.2f%n", num1, num2, result);
                break;
            case 3:
                result = multiply(num1, num2);
                System.out.printf("%.2f * %.2f = %.2f%n", num1, num2, result);
                break;
            case 4:
                result = divide(num1, num2);
                if (!Double.isNaN(result)) {
                    System.out.printf("%.2f / %.2f = %.2f%n", num1, num2, result);
                }
                break;
            default:
                System.out.println("Invalid choice! Please choose between 1, 2, 3, or 4.");
        }

        scanner.close();
    }
}
