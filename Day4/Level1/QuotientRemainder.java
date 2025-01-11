import java.util.Scanner;

class QuotientRemainder {
      
    // Method to calculate quotient and remainder
    public static int[] findQuotientAndRemainder(int number, int divisor) {
        int quotient = number / divisor;
        int remainder = number % divisor;
        return new int[] {quotient, remainder};

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // take input from user
        
        System.out.print("Enter the number: ");
        int number = sc.nextInt();

        System.out.print("Enter the divisor: ");
        int divisor = sc.nextInt();

        // Print the results
        int[] result = findQuotientAndRemainder(number, divisor);
        System.out.println("Quotient: " + result[0] + ", Remainder: " + result[1]);

        sc.close();
    }
}
