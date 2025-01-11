import java.util.Scanner;

public class HeightConversion {
    public static void main(String[] args) {
       
       //Create a Scanner object to take input from user 
	    Scanner input = new Scanner(System.in);
        
        //Declare varaible for centimeter
          Double centimeter;
        
        // Take input from user
        System.out.print("Enter height in centimeters: ");
        centimeter = input.nextDouble();
        
        // Convert cm to inches
        double inches = centimeter / 2.54;
		
		 // Convert inches to feet
        double feet = inches / 12; 
        
        // Print the height in feet and inches
        System.out.println("Your Height in cm is " + centimeter + " while in feet is " + feet + " and inches is " + inches);
        
     
        input.close();
    }
}
