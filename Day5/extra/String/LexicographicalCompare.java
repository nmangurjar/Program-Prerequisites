import java.util.Scanner;

 class LexicographicalCompare {
    
    // Method to compare two strings lexicographically
    public static int compareStrings(String str1, String str2) {
        int minLength = Math.min(str1.length(), str2.length());
        
        // Compare character by character
        for (int i = 0; i < minLength; i++) {
            char ch1 = str1.charAt(i);
            char ch2 = str2.charAt(i);
            
            // If characters are different, return the difference
            if (ch1 != ch2) {
                return ch1 - ch2;
            }
        }
        
        // If all characters are the same, compare the lengths
        return str1.length() - str2.length();
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input two strings from the user
        System.out.print("Enter the first string: ");
        String str1 = scanner.nextLine();

        System.out.print("Enter the second string: ");
        String str2 = scanner.nextLine();

        // Compare the strings
        int result = compareStrings(str1, str2);

        // Output the comparis
    }}