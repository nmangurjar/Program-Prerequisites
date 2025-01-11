import java.util.Scanner;

public class EvenOddComparison {

    // Method to check if a number is positive or negative


    public static String isPositive(int number) {
        if (number >= 0) {

            return "positive";
        } else {

            return "negative";
        }
    }

    // Method to check positive number is even or odd

    public static String isEven(int number) {
        if (number % 2 == 0) {
            return "even";
        }
         else {
            return "odd";
        }
    }

    // compare two numbers
    public static int compare(int number1, int number2) {
        if (number1 > number2) {
            return 1;
        } else if (number1 == number2) {
            return 0;
        } else {
            return -1;
        }
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Array to store 5 numbers
        int[] numbers = new int[5];

        // Input 5 numbers from the user
        System.out.println("Enter 5 numbers:");
        for (int i = 0; i < 5; i++) {
            numbers[i] = scanner.nextInt();
        }

        // Check each number if it's positive or negative, and if positive, check if even or odd
        for (int i = 0; i < 5; i++) {
            String result = isPositive(numbers[i]);
            if (result.equals("positive")) {
                String evenOdd = isEven(numbers[i]);
                System.out.println("Number " + numbers[i] + " is positive and " + evenOdd + ".");
            } else {
                System.out.println("Number " + numbers[i] + " is negative.");
            }
        }

        // Compare the first and last elements 
        int comparisonResult = compare(numbers[0], numbers[4]);
        if (comparisonResult == 1) {
            System.out.println("The first number is greater than the last number.");
        } else if (comparisonResult == 0) {
            System.out.println("The first number is equal to the last number.");
        } else {
            System.out.println("The first number is less than the last number.");
        }

        
        scanner.close();
    }
}
