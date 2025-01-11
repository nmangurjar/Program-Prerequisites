import java.util.Arrays;

public class Palindrome {

    public static void main(String[] args) {
        int number = 1221;

        // Find count of digits
        int count = countDigits(number);
        System.out.println("Count of digits: " + count);

        // Store digits in an array
        int[] digits = storeDigits(number);
        System.out.println("Digits array: " + Arrays.toString(digits));

        // Reverse digits array
        int[] reversedDigits = reverseDigits(digits);
        System.out.println("Reversed digits array: " + Arrays.toString(reversedDigits));

        // Compare two arrays
        boolean isEqual = compareArrays(digits, reversedDigits);
        System.out.println("Are the digits array and reversed array equal? " + isEqual);

        // Check if the number is a palindrome
        boolean isPalindrome = isPalindrome(digits);
        System.out.println("Is the number a palindrome? " + isPalindrome);

        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is the number a duck number? " + isDuck);
    }

    // find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // store the digits of the number in an array
    public static int[] storeDigits(int number) {
        int count = countDigits(number);
        int[] digits = new int[count];
        for (int i = count - 1; i >= 0; i--) {
            digits[i] = number % 10;
            number /= 10;
        }
        return digits;
    }

    // reverse the digits array
    public static int[] reverseDigits(int[] digits) {
        int[] reversed = new int[digits.length];
        for (int i = 0; i < digits.length; i++) {
            reversed[i] = digits[digits.length - 1 - i];
        }
        return reversed;
    }

    // compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        return Arrays.equals(array1, array2);
    }

    // check if a number is a palindrome using the digits array
    public static boolean isPalindrome(int[] digits) {
        int[] reversed = reverseDigits(digits);
        return compareArrays(digits, reversed);
    }

    // check if a number is a duck number using the digits array
    public static boolean isDuckNumber(int[] digits) {
        for (int i = 1; i < digits.length; i++) { // Start from index avoid leading zero
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }
}
