import java.util.Scanner;

 class PalindromeChecker {

    public static boolean isPalindrome(String str) {
        String cleanedStr = str.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversedStr = new StringBuilder(cleanedStr).reverse().toString();
        return cleanedStr.equals(reversedStr);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a string to check if it's a palindrome:");
        String input = scanner.nextLine();

        if (isPalindrome(input)) {
            System.out.println(input + " is a palindrome.");
        } else {
            System.out.println(input + " is not a palindrome.");
        }
    }
}
