public class ReplaceWord {
    public static void main(String[] args) {
        String sentence = "Java is a popular programming language";
        String wordToReplace = "popular";
        String replacementWord = "powerful";

        String modifiedSentence = replaceWord(sentence, wordToReplace, replacementWord);
        System.out.println("Modified Sentence: " + modifiedSentence);
    }

    public static String replaceWord(String sentence, String wordToReplace, String replacementWord) {
        return sentence.replace(wordToReplace, replacementWord);
    }
}
