public class UnitConverter {
   
    //  convert kilometers to miles
    public static double convertKmToMiles(double km) {

        double kmToMiles = 0.621371;
        return km * kmToMiles;
    }

    //miles to kilometers

    public static double convertMilesToKm(double miles) {
        double milesToKm = 1.60934;
        return miles * milesToKm;
    }

    // convert meters to feet
    public static double convertMetersToFeet(double meters) {
        double metersToFeet = 3.28084;

        return meters * metersToFeet;
    }

    //  convert feet to meters
    public static double convertFeetToMeters(double feet) {
        double feetToMeters = 0.3048;
        return feet * feetToMeters;
    }

    public static void main(String[] args) {
       
        
        System.out.println("10 km is equal to " + convertKmToMiles(10) + " miles.");
        System.out.println("10 miles is equal to " + convertMilesToKm(10) + " kilometers.");
        System.out.println("10 meters is equal to " + convertMetersToFeet(10) + " feet.");
        System.out.println("10 feet is equal to " + convertFeetToMeters(10) + " meters.");
    }
}
