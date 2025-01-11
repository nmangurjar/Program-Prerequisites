import java.util.Scanner;

class lv3_problem5_dayOfWeek {
    public static void main(String[] args) {
        // Create a Scanner object to take input from the user
        Scanner input = new Scanner(System.in);

        // Take input for month, day, and year
        System.out.print("Enter month (1-12): ");
        int month = input.nextInt();
        System.out.print("Enter day (1-31): ");
        int day = input.nextInt();
        System.out.print("Enter year: ");
        int year = input.nextInt();

        // Calculate y0, x, m0, and d0 as per the formula
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        int d0 = (day + x + 31 * m0 / 12) % 7;

        // Output the day of the week
        System.out.println("The day of the week is: " + d0);

        // Close the scanner object
        input.close();
    }
}
