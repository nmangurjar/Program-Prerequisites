import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class DateArithmetic {
    public static void main(String[] args) {
        // Create a scanner for user input
        Scanner scanner = new Scanner(System.in);
        
        // Input prompt for the user to enter a date
        System.out.print("Enter a date (yyyy-MM-dd): ");
        String inputDate = scanner.nextLine();
        
        // Define the formatter for the input date
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd");
        
        // Parse the input date into LocalDate
        LocalDate date = LocalDate.parse(inputDate, formatter);
        
        // Perform date arithmetic
        LocalDate result = date.plusDays(7)           
                               .plusMonths(1)        
                               .plusYears(2)        
                               .minusWeeks(3);       
        
        // Display the original and resulting dates
        System.out.println("Original date: " + date);
        System.out.println("Resulting date after modifications: " + result);
        
        scanner.close();
    }
}
