import java.util.Scanner;

class lv1_problem1_checkDivisibleBy5 {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get the number input
      int number = input.nextInt();

      // Check if the number is divisible by 5
      boolean isDivisible = (number % 5 == 0);

      // Print the result
      System.out.println("Is the number " + number + " divisible by 5? " + isDivisible);

      // Close the scanner stream
      input.close();
   }
}
