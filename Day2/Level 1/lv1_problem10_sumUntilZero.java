import java.util.Scanner;

class lv1_problem10_sumUntilZero {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Define total to store sum
      double total = 0.0;

      // Loop until user enters 0
      while (true) {
         // Get the input from the user
         double number = input.nextDouble();

         // Break the loop if number is 0
         if (number == 0) {
            break;
         }

         // Add the number to total
         total += number;
      }

      // Print the total sum
      System.out.println("Total sum is: " + total);

      // Close the scanner stream
      input.close();
   }
}
