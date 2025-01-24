public class RemoveCharacter {
    public static void main(String[] args) {
        String str = "Hello World";
        char charToRemove = 'l';
        System.out.println("Modified String: \"" + removeCharacter(str, charToRemove) + "\"");
    }

    public static String removeCharacter(String str, char charToRemove) {
        String result = "";
        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) != charToRemove) {
                result += str.charAt(i);
            }
        }
        return result;
    }
}
