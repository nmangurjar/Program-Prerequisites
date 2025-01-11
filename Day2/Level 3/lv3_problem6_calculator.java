import java.util.Scanner;

class lv3_problem6_calculator {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Declare variables for two numbers and operator
        double first, second;
        String operator;

        // Get input values from the user
        System.out.print("Enter first number: ");
        first = input.nextDouble();
        System.out.print("Enter second number: ");
        second = input.nextDouble();
        System.out.print("Enter operator (+, -, *, /): ");
        operator = input.next();

        // Perform calculation based on the operator
        switch (operator) {
            case "+":
                System.out.println("Result: " + (first + second));
                break;
            case "-":
                System.out.println("Result: " + (first - second));
                break;
            case "*":
                System.out.println("Result: " + (first * second));
                break;
            case "/":
                if (second != 0) {
                    System.out.println("Result: " + (first / second));
                } else {
                    System.out.println("Error: Division by zero.");
                }
                break;
            default:
                System.out.println("Invalid operator.");
        }

        // Close the scanner object
        input.close();
    }
}
