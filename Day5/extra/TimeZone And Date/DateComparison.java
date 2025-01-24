import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateComparison {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Define the formatter for the input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");

        // Take two date inputs from the user
        System.out.print("Enter the first date (yyyy-MM-dd): ");
        String inputDate1 = scanner.nextLine();
        System.out.print("Enter the second date (yyyy-MM-dd): ");
        String inputDate2 = scanner.nextLine();

        // Parse the input dates into LocalDate objects
        LocalDate date1 = LocalDate.parse(inputDate1, formatter);
        LocalDate date2 = LocalDate.parse(inputDate2, formatter);

        // Compare the two dates
        if (date1.isBefore(date2)) {
            System.out.println("The first date is before the second date.");
        } else if (date1.isAfter(date2)) {
            System.out.println("The first date is after the second date.");
        } else if (date1.isEqual(date2)) {
            System.out.println("The first date is the same as the second date.");
        }

        // Close the scanner to avoid resource leak
        scanner.close();
    }
}

