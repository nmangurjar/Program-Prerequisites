import java.util.Scanner;

class CheckNumber {
   
       // Method to check if the number is positive, negative, or zero
    public static int checkNumber(int number) {
         if (number > 0) return 1;    // Positive
        else if (number < 0) return -1; // Negative
        return 0;                   // Zero
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        
        // take input from user
        System.out.print("Enter a number: ");
        int number = sc.nextInt();

        // Print the result
        int result = checkNumber(number);
        if (result == 1)
            System.out.println("The number is Positive.");
        else if (result == -1)
            System.out.println("The number is Negative.");
        else
            System.out.println("The number is Zero.");

        sc.close();
    }
}
