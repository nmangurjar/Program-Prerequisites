import java.util.Scanner;

class FactorArray {
   public static void main(String[] args) {

       // Create a scanner object
       Scanner input = new Scanner(System.in);

       int number;
       // Take input from user
       System.out.println("Enter Number");
       number = input.nextInt();

       int[] maxFactor  = new int[number];





        int e=0;
       // Store factors in array
       for (int i = 1; i < number; i++) {
           if (number % i == 0) {
             maxFactor[e]=i;
             e++;

           }
       }

       //Printing factor array
       System.out.println("Factors of "+number);

       for (int i = 0; i < e; i++) {
           System.out.println(maxFactor[i]);
       }



       input.close();
   }
}


