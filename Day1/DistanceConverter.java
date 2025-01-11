import java.util.Scanner;

public class DistanceConverter {
    public static void main(String[] args) {
       
	   // Create a Scanner 
        Scanner input = new Scanner(System.in);
        
        // take input from user
        System.out.print("Enter the distance in feet: ");
        double distanceInFeet = input.nextDouble();
        
        // Convert feet to yards
        double distanceInYards = distanceInFeet / 3;
        
        // Convert feet to miles
        double distanceInMiles = distanceInYards / 1760;
		
		// Convert feet to centimeter
        double distanceInCentimeter = distanceInFeet * 30.48;
        
		// Convert feet to inches
        double distanceInInches = distanceInFeet * 12;
		
        // Display the results
        System.out.println("Your Height in cm is "+distanceInCentimeter+"  while in feet is "+distanceInFeet+" and inches is "+distanceInInches);
       
        
        
        input.close();
    }
}
