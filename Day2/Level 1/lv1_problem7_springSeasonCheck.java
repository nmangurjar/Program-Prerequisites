import java.util.Scanner;

class lv1_problem7_springSeasonCheck {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get month and day inputs
      int month = input.nextInt();
      int day = input.nextInt();

      // Check if it's spring season (March 20 to June 20)
      if ((month == 3 && day >= 20) || (month > 3 && month < 6) || (month == 6 && day <= 20)) {
         System.out.println("It's a Spring Season");
      } else {
         System.out.println("Not a Spring Season");
      }

      // Close the scanner stream
      input.close();
   }
}
