// Program to find multiples of a number below 100
import java.util.Scanner;

class lv2_problem12_MultiplesBelow100 {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input for the number
        System.out.print("Enter a number: ");
        int number = input.nextInt();

        // Loop backward from 100 to 1 to check multiples
        System.out.println("Multiples of " + number + " below 100 are:");
        for (int i = 100; i >= 1; i--) {
            if (i % number == 0) {
                System.out.println(i);
            }
        }

        // Close the Scanner
        input.close();
    }
}
