import java.util.Scanner;

 class SubstringOcuurence {
    
    //count occurrences of a substring
      public static int countOccurrences(String str, String substring) {
        int count = 0;
        int index = 0;
        
        // Loop until no more occurrences are found
        while ((index = str.indexOf(substring, index)) != -1) {
            count++;  // Increment count when the substring is found
            index += substring.length();  // Move past the last found occurrence
        }
        
        return count;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Input string and substring
        System.out.print("Enter the main string: ");
        String mainString = scanner.nextLine();
        
        System.out.print("Enter the substring to search for: ");
        String substring = scanner.nextLine();
        
        // Count and display the number of occurrences
        int occurrences = countOccurrences(mainString, substring);
        System.out.println("The substring '" + substring + "' occurs " + occurrences + " time(s) in the main string.");
        
        scanner.close();
    }
}
