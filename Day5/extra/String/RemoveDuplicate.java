import java.util.Scanner;

 class RemoveDuplicate {

    public static String removeDuplicateCharacters(String input) {
        
		// Using StringBuilder to build the result string
        StringBuilder result = new StringBuilder();
        
        // Set to track encountered characters
        boolean[] seen = new boolean[256]; // Assuming ASCII characters

        // Iterate through the input string
        for (int i = 0; i < input.length(); i++) {
            char ch = input.charAt(i);
            
            // If character has not been encountered yet, add it to result
            if (!seen[ch]) {
                result.append(ch);
                seen[ch] = true; // Mark character as seen
            }
        }

        return result.toString();
    }

    public static void main(String[] args) {
        // Create a Scanner object to read input
        Scanner scanner = new Scanner(System.in);

        // Prompt user for input string
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();

        // Call method to remove duplicates
        String modifiedString = removeDuplicateCharacters(input);

        // Display the result
        System.out.println("String after removing duplicates: " + modifiedString);

        // Close the scanner
        scanner.close();
    }
}
