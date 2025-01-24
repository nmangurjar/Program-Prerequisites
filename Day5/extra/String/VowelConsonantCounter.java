import java.util.Scanner;

 class VowelConsonantCounter {

    public static void main(String[] args) {
       
	   // Create a Scanner object to read input
        Scanner input = new Scanner(System.in);

        //take input from user
        System.out.print("Enter a string: ");
        String s = input.nextLine();

        // create counters for vowels and consonants
        int vowelCount = 0;
        int consonantCount = 0;

        // Convert the input string to lowercase
        s = s.toLowerCase();

       
        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);

            // Check if the character is a letter
                if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
                    vowelCount++;
                } else {
                    consonantCount++;
                }

        }

        // Print the result
        System.out.println("Number of vowels: " +vowelCount);
        System.out.println("Number of consonants: " + consonantCount);

        // Close the scanner
        input.close();
    }
}
