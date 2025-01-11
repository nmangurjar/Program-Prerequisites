public class Lv3_problem5_NumberChecker {

    public static void main(String[] args) {
        int number = 25;

        // Check if the number is prime
        boolean isPrime = isPrimeNumber(number);
        System.out.println("Is the number a prime number? " + isPrime);

        // Check if the number is a neon number
        boolean isNeon = isNeonNumber(number);
        System.out.println("Is the number a neon number? " + isNeon);

        // Check if the number is a spy number
        boolean isSpy = isSpyNumber(number);
        System.out.println("Is the number a spy number? " + isSpy);

        // Check if the number is an automorphic number
        boolean isAutomorphic = isAutomorphicNumber(number);
        System.out.println("Is the number an automorphic number? " + isAutomorphic);

        // Check if the number is a buzz number
        boolean isBuzz = isBuzzNumber(number);
        System.out.println("Is the number a buzz number? " + isBuzz);
    }

    // Method to check if a number is a prime number
    public static boolean isPrimeNumber(int number) {
        if (number <= 1) return false;
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }

    // Method to check if a number is a neon number
    public static boolean isNeonNumber(int number) {
        int square = number * number;
        int sum = 0;
        while (square != 0) {
            sum += square % 10;
            square /= 10;
        }
        return sum == number;
    }

    // Method to check if a number is a spy number
    public static boolean isSpyNumber(int number) {
        int sum = 0, product = 1;
        while (number != 0) {
            int digit = number % 10;
            sum += digit;
            product *= digit;
            number /= 10;
        }
        return sum == product;
    }

    // Method to check if a number is an automorphic number
    public static boolean isAutomorphicNumber(int number) {
        int square = number * number;
        return String.valueOf(square).endsWith(String.valueOf(number));
    }

    // Method to check if a number is a buzz number
    public static boolean isBuzzNumber(int number) {
        return number % 7 == 0 || number % 10 == 7;
    }
}
