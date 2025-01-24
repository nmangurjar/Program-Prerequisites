import java.util.Scanner;

 class LongestWordFinder {
    public static void main(String[] args) {
        
		// Create a Scanner object to take user input
        Scanner input = new Scanner(System.in);
        
        // take user input
        System.out.println("Enter a sentence:");
        String sentence = input.nextLine();
        
        // Split the sentence into words
        String[] words = sentence.split("\\s+");
        
        // Craete variable to keep track of the longest word
        String longestWord = "";
        

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }
        
        // Print longest word
        System.out.println("The longest word is: " + longestWord);
        
        
        input.close();
    }
}
