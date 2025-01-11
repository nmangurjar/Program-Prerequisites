import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
       
       //Create a Scanner object to take input from user 
	     Scanner input = new Scanner(System.in);
        
        // Declare variables to store two no's
        double number1, number2;
        
        // Take first Number from user
        System.out.print("Enter the first number: ");
        number1 = input.nextDouble();
        
        //  Take second Number from user
        System.out.print("Enter the second number: ");
        number2 = input.nextDouble();
        
        //Perform operations
      
    	  double addition = number1 + number2;
        double subtraction = number1 - number2;
        double multiplication = number1 * number2;
		double division;
        
		//For division check which number is greater
		
		if(number1>number2){
		division = number1/number2;
		}
		else{
		division = number2/number1;
	        } 
		
        
        //Print the results
        System.out.println("The addition, subtraction, multiplication and division value of 2 numbers "  + number1 + " and " + number2 + " is "+ addition + ", " + subtraction + ", " + multiplication + ", and " + division);
        
      
        input.close();
    }
}
