public class MostFrequentCharacter {
    public static void main(String[] args) {
        String str = "success";
        System.out.println("Most Frequent Character: '" + findMostFrequentCharacter(str) + "'");
    }

    public static char findMostFrequentCharacter(String str) {
        int maxCount = 0;
        char mostFrequentChar = '\0';

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);
            int count = 0;

            // Count occurrences of currentChar
            for (int j = 0; j < str.length(); j++) {
                if (str.charAt(j) == currentChar) {
                    count++;
                }
            }

            // Update most frequent character
            if (count > maxCount) {
                maxCount = count;
                mostFrequentChar = currentChar;
            }
        }

        return mostFrequentChar;
    }
}
