import java.util.Scanner;

class lv1_problem5_checkVotingEligibility {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get the age input
      int age = input.nextInt();

      // Check if the person can vote
      if (age >= 18) {
         System.out.println("The person's age is " + age + " and can vote.");
      } else {
         System.out.println("The person's age is " + age + " and cannot vote.");
      }

      // Close the scanner stream
      input.close();
   }
}
