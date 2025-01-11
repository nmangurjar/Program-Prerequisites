// FizzBuzz program using a while loop
import java.util.Scanner;

class lv2_problem6_FizzBuzzWhile {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get the number as input
        System.out.print("Enter a positive integer: ");
        int num = input.nextInt();

        // Loop from 1 to num using while loop
        if (num > 0) {
            int i = 1;
            while (i <= num) {
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } else {
                    System.out.println(i);
                }
                i++;
            }
        } else {
            System.out.println("Please enter a positive integer.");
        }

        // Close the Scanner
        input.close();
    }
}
