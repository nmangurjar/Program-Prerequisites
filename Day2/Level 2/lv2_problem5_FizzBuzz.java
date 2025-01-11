// FizzBuzz program using a for loop
import java.util.Scanner;

class lv2_problem5_FizzBuzz {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number as input
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        // Loop from 1 to num
        if (num > 0) {
            for (int i = 1; i <= num; i++) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner
        input.close();
    }
}
