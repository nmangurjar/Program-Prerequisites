import java.util.Scanner;

public class AnagramCheck{

    // Method to check if two texts are anagrams
    public static boolean areAnagrams(String s1, String s2) {
       
        // Check if lengths of the two texts are equal

        if (s1.length() != s2.length()) {
            return false;
        }

        // Create an array to store the frequency of characters

        int[] frequency1 = new int[26];
        int[] frequency2 = new int[26];

        // Convert texts to lowercase to handle case insensitivity
        s1 = s1.toLowerCase();
        s2 = s2.toLowerCase();

        // Find the frequency of characters in the first text

        for (char c : s1.toCharArray()) {
            frequency1[c - 'a']++;
        }

        // Find the frequency of characters in the second text
        for (char c : s2.toCharArray()) {
            frequency2[c - 'a']++;
        }

        // Compare the frequency of characters in both texts
        for (int i = 0; i < 26; i++) {
            if (frequency1[i] != frequency2[i]) {
                return false;
            }
        }

        return true; 
    }

    public static void main(String[] args) {
        //Create scanner object
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter the first text: ");
        String s1 = input.nextLine();

        System.out.print("Enter the second text: ");
        String s2 = input.nextLine();

        // Check if the two texts are anagrams
        boolean result = areAnagrams(s1, s2);

        // Display the result
        if (result) {
            System.out.println("The texts are anagrams.");
        } else {
            System.out.println("The texts are not anagrams.");
        }

        input.close();
    }
}
