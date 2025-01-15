import java.util.Scanner;

public class StringLength {

    // Method to find the length of the string without using length() method
	
    public static int findStringLength(String str) {
        int length = 0;
		
        try {
            // Infinite loop to iterate through the string until the exception is thrown
            while (true) {
                str.charAt(length);  
                length++;  
            }
        } catch (StringIndexOutOfBoundsException e) {
           
            return length;
        }
    }

    public static void main(String[] args) {
       
	   // Create a Scanner object 
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

        // Call the custom method to find length without using length()
        int userDefined = findStringLength(str);

        // Call the built-in length() method
        int builtIn = str.length();

        // Print both the results
        System.out.println("Length of the string using user method: " + userDefined);
        System.out.println("Length of the string using built-in method: " + builtIn);
    }
}
