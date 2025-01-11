import java.util.Scanner;

class Chill {
    
    // Method to calculate wind chill temperature
    public static double calculateWindChill(double temperature, double windSpeed) {
       
        return 35.74 + (0.6215 * temperature) + (0.4275 * temperature - 35.75) * Math.pow(windSpeed, 0.16);
    }

    public static void main(String[] args) {
      
      
        Scanner sc = new Scanner(System.in);

        //Take input from user
        System.out.print("Enter side 1 (meters): ");
        System.out.print("Enter temperature (°F): ");
        double temperature = sc.nextDouble();

        System.out.print("Enter wind speed (mph): ");
        double windSpeed = sc.nextDouble();

        //Print the results
        double windChill = calculateWindChill(temperature, windSpeed);
        System.out.printf("The wind chill temperature is: %.2f°F%n", windChill);

        sc.close(); 
    }
}
