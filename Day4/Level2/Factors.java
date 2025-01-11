import java.util.Scanner;

public class Factors {
   
   
     // Method to find the factors of a number and return them in an array
    public static int[] findFactors(int number) {
        int count = 0;
        
        // Find the count 
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) count++;
        }

        // array to store the factors
        int[] factors = new int[count];
        int index = 0;

        // Store the factors in  array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index++] = i;
            }
        }
        return factors;
    }

    // Method to calculate the sum of factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0;
        for (int factor : factors) {
            sum += factor;
        }
        return sum;
    }

    // Method to calculate the sum of squares of factors
    public static double sumOfSquares(int[] factors) {
        double sumOfSquares = 0;
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2);
        }
        return sumOfSquares;
    }

    // Method to calculate the product of factors
    public static int productOfFactors(int[] factors) {
        int product = 1;
        for (int factor : factors) {
            product *= factor;
        }
        return product;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();
        
       
        int[] factors = findFactors(number);
        
        // Print the factors
        System.out.print("Factors of " + number + ": ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        
        //Print the sum, sum of squares, and product of factors
        System.out.println("\nSum of factors: " + sumOfFactors(factors));
        System.out.println("Sum of squares of factors: " + sumOfSquares(factors));
        System.out.println("Product of factors: " + productOfFactors(factors));
        
        sc.close();
    }
}
