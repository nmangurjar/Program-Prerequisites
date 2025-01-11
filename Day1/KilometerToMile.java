import java.util.Scanner;

public class KilometerToMile {
    public static void main(String[] args) {
        
		//Create a Scanner object to take input from user 
        Scanner input = new Scanner(System.in);
        
    
        double km;
        
      
        System.out.print("Enter the distance in kilometers: ");
        
        //Take input from user
        km = input.nextDouble();
        
        //Convert kilometers in miles
        double miles = km / 1.6;
        
        //Printing distance in miles.

        System.out.println("The total miles is " + miles + " mile for the given " + km + " km");
        
      //close scanner object
        input.close();
    }
}
