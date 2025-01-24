import java.util.Scanner;

public class WordLength {

    // Method to split the input text into words
    public static String[] splitTextIntoWords(String text) {
        StringBuilder word = new StringBuilder();
        StringBuilder tempWord = new StringBuilder();
        String[] words = new String[text.length()];
        int index = 0;

        // Loop through each character and build words
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isWhitespace(c)) {
                if (word.length() > 0) {
                    words[index++] = word.toString();
                    word.setLength(0); // Clear the StringBuilder for the next word
                }
            } else {
                word.append(c);
            }
        }

        // Add the last word if the input doesn't end with space
        if (word.length() > 0) {
            words[index++] = word.toString();
        }

        // Return the words up to the last valid index
        String[] finalWords = new String[index];
        System.arraycopy(words, 0, finalWords, 0, index);

        return finalWords;
    }

    // Method to calculate the length of a word without using the length() method
    public static int getLength(String word) {
        int length = 0;
        for (int i = 0; i < word.length(); i++) {
            length++;
        }
        return length;
    }

    // Method to create the 2D array with words and their lengths
    public static String[][] getWordsWithLength(String[] words) {
        String[][] result = new String[words.length][2];

        for (int i = 0; i < words.length; i++) {
            String word = words[i];
            int length = getLength(word);
            result[i][0] = word; // Store word
            result[i][1] = String.valueOf(length); // Store length as a String
        }
        return result;
    }

    // Main function to handle user input and display results
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Take user input for text
        System.out.println("Enter a text:");
        String inputText = scanner.nextLine();

        // Split the text into words
        String[] words = splitTextIntoWords(inputText);

        // Get words along with their lengths
        String[][] wordsWithLength = getWordsWithLength(words);

        // Display the result in a tabular format
        System.out.println("Word\tLength");
        System.out.println("-----------------------");
        for (int i = 0; i < wordsWithLength.length; i++) {
            String word = wordsWithLength[i][0];
            int length = Integer.parseInt(wordsWithLength[i][1]); // Convert length from String to int
            System.out.println(word + "\t" + length);
        }

        // Close the scanner
        scanner.close();
    }
}
