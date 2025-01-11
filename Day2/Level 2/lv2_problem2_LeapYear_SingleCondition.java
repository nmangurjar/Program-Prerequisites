// LeapYear program rewritten using a single if condition with logical operators
import java.util.Scanner;

class lv2_problem2_LeapYear_SingleCondition {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Get year as input
        System.out.print("Enter a year (>= 1582): ");
        int year = input.nextInt();

        // Check if the year is valid for Gregorian calendar and determine Leap Year
        if (year >= 1582 && (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0))) {
            System.out.println(year + " is a Leap Year.");
        } else if (year >= 1582) {
            System.out.println(year + " is not a Leap Year.");
        } else {
            System.out.println("Year must be >= 1582.");
        }

        // Close the Scanner
        input.close();
    }
}
