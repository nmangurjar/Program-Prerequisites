import java.util.Scanner;

class lv1_problem8_rocketCountdownWhile {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get the countdown number input
      int counter = input.nextInt();

      // Countdown using while loop
      while (counter >= 1) {
         System.out.println(counter);
         counter--;
      }

      // Close the scanner stream
      input.close();
   }
}
