import java.util.Scanner;

class lv1_problem4_sumOfNaturalNumbers {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get the number input
      int n = input.nextInt();

      // Check if the number is a positive integer
      if (n > 0) {
         // Calculate the sum using the formula
         int sum = n * (n + 1) / 2;

         // Print the sum
         System.out.println("The sum of " + n + " natural numbers is " + sum);
      } else {
         System.out.println(n + " is not a natural number");
      }

      // Close the scanner stream
      input.close();
   }
}
