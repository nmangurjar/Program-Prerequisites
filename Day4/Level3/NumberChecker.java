import java.util.Arrays;

public class NumberChecker {

    // find the count of digits in the number
    public static int countDigits(int number) {
        return String.valueOf(Math.abs(number)).length();
    }

    // store the digits of the number in a digits array
    public static int[] getDigitsArray(int number) {
        String numberStr = String.valueOf(Math.abs(number));
        int[] digits = new int[numberStr.length()];
        for (int i = 0; i < numberStr.length(); i++) {
            digits[i] = numberStr.charAt(i) - '0';
        }
        return digits;
    }

    // find the sum of the digits of a number using the digits array
    public static int sumOfDigits(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += digit;
        }
        return sum;
    }

    // find the sum of the squares of the digits of a number using the digits array
    public static int sumOfSquares(int[] digits) {
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, 2);
        }
        return sum;
    }

    // check if a number is a Harshad number using a digits array
    public static boolean isHarshadNumber(int number, int[] digits) {
        int sum = sumOfDigits(digits);
        return number % sum == 0;
    }

    // find the frequency of each digit in the number
    public static int[][] digitFrequency(int[] digits) {
        int[][] frequency = new int[10][2]; // 0-9 digits and their frequency

        // Initialize the frequency array
        for (int i = 0; i < 10; i++) {
            frequency[i][0] = i; // Digit
            frequency[i][1] = 0; // Frequency
        }

        // Count frequencies
        for (int digit : digits) {
            frequency[digit][1]++;
        }

        return frequency;
    }

    public static void main(String[] args) {
        int number = 12321; // Example number

        // Find count of digits
        int digitCount = countDigits(number);
        System.out.println("Number of digits: " + digitCount);

        // Store digits in an array
        int[] digits = getDigitsArray(number);
        System.out.println("Digits: " + Arrays.toString(digits));

        // Find the sum of digits
        int sumDigits = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sumDigits);

        // Find the sum of the squares of digits
        int sumSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumSquares);

        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number, digits);
        System.out.println("Is Harshad Number: " + isHarshad);

        // Find the frequency of each digit
        int[][] frequency = digitFrequency(digits);
        System.out.println("Digit frequencies:");
        for (int[] row : frequency) {
            if (row[1] > 0) {
                System.out.println("Digit: " + row[0] + ", Frequency: " + row[1]);
            }
        }
    }
}
