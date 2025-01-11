import java.util.Scanner;

class lv1_problem9_rocketCountdownFor {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get the countdown number input
      int counter = input.nextInt();

      // Countdown using for loop
      for (int i = counter; i >= 1; i--) {
         System.out.println(i);
      }

      // Close the scanner stream
      input.close();
   }
}
