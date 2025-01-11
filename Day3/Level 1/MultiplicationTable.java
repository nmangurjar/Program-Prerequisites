
import java.util.*;

class MultiplicationTable {
   public static void main(String args[]) {

       //Create scanner class
       Scanner input = new Scanner(System.in);

       // Take input from user
       System.out.println("Enter number :");
       int number = input.nextInt();

       // Create Array to store result
       int multiplicationResult[] = new int[4];

       //Calculate table
       for (int i =0; i < 4; i++) {
           multiplicationResult[i] = number * (i+6);
       }

       // Print the result
       for (int i = 0; i < 4; i++) {
           System.out.println(number + " * " + (i+6) + " = " + multiplicationResult[i]);
       }

       input.close();
   }
}

