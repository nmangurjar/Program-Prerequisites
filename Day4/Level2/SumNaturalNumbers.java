import java.util.Scanner;

public class SumNaturalNumbers {
   
    // Recursive method to find the sum of n natural numbers

    public static int sumUsingRecursion(int n) {
       
        if (n <= 0) {
            return 0;
        }
        return n + sumUsingRecursion(n - 1);
    }

    // Method to find the sum of n natural numbers using the formula n*(n+1)/2
    public static int sumUsingFormula(int n) {
        return n * (n + 1) / 2;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Take input from the user
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        
        /
        if (n <= 0) {
            System.out.println("Please enter a valid natural number.");
            return;
        }
        
        // Calculate and print the sum using recursion and formula
        int sumRecursion = sumUsingRecursion(n);
        int sumFormula = sumUsingFormula(n);
        
        System.out.println("Sum using recursion: " + sumRecursion);
        System.out.println("Sum using formula: " + sumFormula);
        
        // Compare the results
            if (sumRecursion == sumFormula) {
            System.out.println("Both methods give the same result.");
        } 
        else
         {
            System.out.println("The results do not match.");
        }
        
        sc.close();
    }
}
