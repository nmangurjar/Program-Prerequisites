import java.util.Scanner;

class OddAndEvenArray {
   public static void main(String[] args) {

      // Create a scanner object
      Scanner input = new Scanner(System.in);

      int number;
      // Take input from user
      System.out.println("Enter Number");
      number = input.nextInt();
      int[] even = new int[number / 2 + 1];
      int[] odd = new int[number / 2 + 1];



      //Create index variables for odd and even numbers and initialize them to zero
      int e = 0;
      int o = 0;

      // Store odd no in odd array and even no in even array
      for (int i = 1; i < number; i++) {
         if (i % 2 == 0) {
            even[e] = i;
            e++;
         } else {
            odd[o] = i;
            o++;
         }
      }

      //Printing even array
      System.out.println("Even array :");

      for (int i = 0; i < e; i++) {
         System.out.println(even[i]);
      }

      //Printing odd array
      System.out.println("Odd array :");

      for (int i = 0; i < o; i++) {
         System.out.println(odd[i]);
      }

      input.close();
   }
}
