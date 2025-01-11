public class UnitConverterTwo {

    //  convert Fahrenheit to Celsius

    public static double convertFahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;

    }

    //  convert Celsius to Fahrenheit

    public static double convertCelsiusToFahrenheit(double celsius) {
        return (celsius * 9 / 5) + 32;
    }

    //  convert pounds to kilograms
 
    public static double convertPoundsToKilograms(double pounds) {
        return pounds * 0.453592;

    }

    //  convert kilograms to pounds
 
    public static double convertKilogramsToPounds(double kilograms) {
        return kilograms * 2.20462;
    }

    //  convert gallons to liters
   
    public static double convertGallonsToLiters(double gallons) {
        return gallons * 3.78541;
    }

    //  convert liters to gallons
   
    public static double convertLitersToGallons(double liters) {
        return liters * 0.264172;
    }

    public static void main(String[] args) {
       
        // Check method
        double fahrenheit = 100;
        double celsius = 37;
        double pounds = 150;
        double kilograms = 68;
        double gallons = 10;
        double liters = 20;

       
        System.out.println(fahrenheit + "°F is equal to " + convertFahrenheitToCelsius(fahrenheit) + "°C.");
        System.out.println(celsius + "°C is equal to " + convertCelsiusToFahrenheit(celsius) + "°F.");
        System.out.println(pounds + " pounds is equal to " + convertPoundsToKilograms(pounds) + " kilograms.");
        System.out.println(kilograms + " kilograms is equal to " + convertKilogramsToPounds(kilograms) + " pounds.");

        System.out.println(gallons + " gallons is equal to " + convertGallonsToLiters(gallons) + " liters.");

        System.out.println(liters + " liters is equal to " + convertLitersToGallons(liters) + " gallons.");
    }
}
