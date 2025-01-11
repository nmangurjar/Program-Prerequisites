import java.util.Scanner;

public class SideOfSquare {
    public static void main(String[] args) {
      
	   //Create a Scanner object to take input from user 
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for the perimeter of the square
        double perimeter;
        
        //Take input from user
        System.out.print("Enter the perimeter of the square: ");
        perimeter = input.nextDouble();
        
        // Calculate the length of side 
        double side = perimeter / 4;
        
        //Print the result
        System.out.println("The length of the side is " + side + " whose perimeter is " + perimeter);
        
       
        input.close();
    }
}
