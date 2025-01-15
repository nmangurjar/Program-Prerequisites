import java.util.Scanner;

public class NumberFormatException {

    // Method to generate the NumberFormatException
    public static void generateException(String text) {
        // This line will throw NumberFormatException if the input text is not a valid number
        int number = Integer.parseInt(text);
        System.out.println("The number is: " + number);
    }

    // Method to handle the exception
    public static void handleException(String text) {
        try {
            // Call the method to generate the exception
            generateException(text);
        } catch (NumberFormatException e) {
            System.out.println("Error: Invalid input, could not convert to a number.");
        } catch (RuntimeException e) {
            System.out.println("Runtime error: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
	
        // Create a scanner object 
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter a number or non-number ): ");
        String input = scanner.nextLine();

        // call the method to generate the exception
        System.out.println("Calling method to generate exception...");
        generateException(input);

        // call the method to handle the exception
        System.out.println("\nNow handling exception...");
        handleException(input);
    }
}
