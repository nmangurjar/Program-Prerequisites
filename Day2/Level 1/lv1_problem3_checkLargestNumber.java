import java.util.Scanner;

class lv1_problem3_checkLargestNumber {
   public static void main(String[] args) {
      // Create a Scanner object for user input
      Scanner input = new Scanner(System.in);

      // Get three number inputs
      int number1 = input.nextInt();
      int number2 = input.nextInt();
      int number3 = input.nextInt();

      // Check if the first, second, or third number is the largest
      boolean isFirstLargest = (number1 > number2) && (number1 > number3);
      boolean isSecondLargest = (number2 > number1) && (number2 > number3);
      boolean isThirdLargest = (number3 > number1) && (number3 > number2);

      // Print the result
      System.out.println("Is the first number the largest? " + isFirstLargest);
      System.out.println("Is the second number the largest? " + isSecondLargest);
      System.out.println("Is the third number the largest? " + isThirdLargest);

      // Close the scanner stream
      input.close();
   }
}
