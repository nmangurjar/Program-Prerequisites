import java.util.Scanner;

public class TemperatureConverter {

    // convert Fahrenheit to Celsius
    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5.0 / 9.0;
    }

    // Function to convert Celsius to Fahrenheit
    public static double celsiusToFahrenheit(double celsius) {
        return (celsius * 9.0 / 5.0) + 32;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Temperature Converter");
        System.out.println("1. Convert Fahrenheit to Celsius");
        System.out.println("2. Convert Celsius to Fahrenheit");
        
        System.out.print("Enter the number of your choice (1 or 2): ");
        int choice = scanner.nextInt();

        if (choice == 1) {
            System.out.print("Enter temperature in Fahrenheit: ");
            double fahrenheit = scanner.nextDouble();
            double celsius = fahrenheitToCelsius(fahrenheit);
            System.out.printf("%.2f°F is equal to %.2f°C%n", fahrenheit, celsius);
        } else if (choice == 2) {
            System.out.print("Enter temperature in Celsius: ");
            double celsius = scanner.nextDouble();
            double fahrenheit = celsiusToFahrenheit(celsius);
            System.out.printf("%.2f°C is equal to %.2f°F%n", celsius, fahrenheit);
        } else {
            System.out.println("Invalid choice. Please enter 1 or 2.");
        }

        scanner.close();
    }
}
