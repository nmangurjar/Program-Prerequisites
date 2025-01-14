import java.util.Scanner;

public class IllegalArgument {

    // Method to generate the exception
    public static void generateException(String text) {
       
        // This will cause an IllegalArgumentException
        System.out.println("Attempting to generate substring...");
		
		 // start index > end index, which will throw an exception
        System.out.println(text.substring(5, 2)); 
    }

    // Method to demonstrate handling IllegalArgumentException
    public static void handleException(String text) {
        try {
            // Call the method that generates the exception
            generateException(text);
        } catch (IllegalArgumentException e) {
            // Handle IllegalArgumentException
            System.out.println("Caught IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other runtime exceptions
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        // Create a scanner to get user input
        Scanner input = new Scanner(System.in);

        // Prompt user to enter a string
        System.out.print("Enter a string: ");
        String text = input.nextLine();

        // Call method to generate the exception
        System.out.println("Calling method to generate Exception...");
        generateException(text);

        // Call method to handle runtime exceptions
        System.out.println("\nNow calling method to handle RuntimeException...");
        handleException(text);

        // Close the scanner
        input.close();
    }
}
