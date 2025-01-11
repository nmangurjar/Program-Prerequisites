import java.util.ArrayList;

public class NumberCheckerTwo {

    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0;
        while (number != 0) {
            number /= 10;
            count++;
        }
        return count;
    }

    // Method to store the digits of the number in a digits array
    public static int[] getDigits(int number) {
        ArrayList<Integer> digitsList = new ArrayList<>();
        while (number != 0) {
            digitsList.add(number % 10);
            number /= 10;
        }
        int[] digitsArray = new int[digitsList.size()];
        for (int i = 0; i < digitsList.size(); i++) {
            digitsArray[i] = digitsList.get(digitsList.size() - 1 - i); // Reverse order
        }
        return digitsArray;
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
        int[] digits = getDigits(number);
        for (int i = 1; i < digits.length; i++) { // Ignore leading zeros
            if (digits[i] == 0) {
                return true;
            }
        }
        return false;
    }

    // Method to check if a number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = getDigits(number);
        int numDigits = digits.length;
        int sum = 0;
        for (int digit : digits) {
            sum += Math.pow(digit, numDigits);
        }
        return sum == number;
    }

    // Method to find the largest and second-largest elements in the digits array
    public static int[] findLargestAndSecondLargest(int number) {
        int[] digits = getDigits(number);
        int largest = Integer.MIN_VALUE;
        int secondLargest = Integer.MIN_VALUE;

        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest;
                largest = digit;
            } else if (digit > secondLargest && digit != largest) {
                secondLargest = digit;
            }
        }

        return new int[] {largest, secondLargest};
    }

    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallestAndSecondSmallest(int number) {
        int[] digits = getDigits(number);
        int smallest = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;

        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit;
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit;
            }
        }

        return new int[] {smallest, secondSmallest};
    }

    public static void main(String[] args) {
        int number = 153; // Example number

        // Count digits
        System.out.println("Count of digits: " + countDigits(number));

        // Store digits
        int[] digits = getDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
            System.out.print(digit + " ");
        }
        System.out.println();

        // Check if duck number
        System.out.println("Is Duck Number: " + isDuckNumber(number));

        // Check if Armstrong number
        System.out.println("Is Armstrong Number: " + isArmstrongNumber(number));

        // Find largest and second-largest
        int[] largest = findLargestAndSecondLargest(number);
        System.out.println("Largest: " + largest[0] + ", Second Largest: " + largest[1]);

        // Find smallest and second smallest
        int[] smallest = findSmallestAndSecondSmallest(number);
        System.out.println("Smallest: " + smallest[0] + ", Second Smallest: " + smallest[1]);
    }
}
