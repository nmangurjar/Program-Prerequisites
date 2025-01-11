
import java.util.Scanner;

public class FizzBuzz {
   public static void main(String[] args) {
       Scanner scanner = new Scanner(System.in);

      int number;
       // Take input from user
       System.out.print("Enter a integer: ");
        number = scanner.nextInt();


       // Create a String array
       String[] result = new String[number + 1];

       // Loop through numbers from 1 to the entered number
       for (int i = 1; i <= number; i++) {
           if (i % 3 == 0 && i % 5 == 0) {

               // Multiple of both 3 and 5
               result[i] = "FizzBuzz";
           }
           else if (i % 3 == 0) {
               result[i] = "Fizz";
           }
           else if (i % 5 == 0) {
               result[i] = "Buzz";
           }
           else {
               result[i] = Integer.toString(i);
           }
       }

       // Print the results
       for (int i = 1; i <= number; i++) {
           System.out.println("Position " + i + " = " + result[i]);
       }


       scanner.close();
   }
}

