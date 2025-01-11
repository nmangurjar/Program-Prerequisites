import java.util.Scanner;

class lv1_problem6_checkNumberSign {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get the number input
      int number = input.nextInt();

      // Check if the number is positive, negative, or zero
      if (number > 0) {
         System.out.println("Positive");
      } else if (number < 0) {
         System.out.println("Negative");
      } else {
         System.out.println("Zero");
      }

      // Close the scanner stream
      input.close();
   }
}
