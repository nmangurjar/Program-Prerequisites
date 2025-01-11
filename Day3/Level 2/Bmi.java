import java.util.*;

class BMI {


   public static void main(String args[]) {
       //create scanner object
       Scanner input = new Scanner(System.in);
	   
	  	  int numberOfPersons ;
	   //Take input from user for No of persons
	   System.out.println("Enter no of persons");
	      numberOfPersons = input.nextInt();
	    
		//Create arrays for height , weight , bmi and status
	   double [] weight = new double [numberOfPersons];
	   double [] height = new double [numberOfPersons];
	   double [] bmi = new double [numberOfPersons];
	   


      
	  //using loop take input for height and weight as well as calculate bmi
	    for(int i=0; i<numberOfPersons;i++) {

			System.out.println("Enter weight of " + (i + 1) + " person in kg");
			weight[i] = input.nextDouble();

			System.out.println("Enter height of " + (i + 1) + " person in feet");
			height[i] = input.nextDouble();

			bmi[i] = weight[i] / Math.pow((height[i]*0.3), 2);
		}

     //Print the status
	   for(int i=0; i<numberOfPersons;i++) {

        if (bmi[i] <= 18.5) {
		  System.out.println("BMI status of person "+(i+1)+" is Underweight.");

        } else if (bmi[i] > 18.5 && bmi[i] < 24.9) {
		  System.out.println("BMI status of person "+(i+1)+" is Normal.");

        } else if (bmi[i] >= 25 && bmi[i] < 29.9) {
		  System.out.println("BMI status of person "+(i+1)+" is OverWeight.");

        } else {
		  System.out.println("BMI status of person "+(i+1)+" is obese.");

        }
    }

	
	input.close();
	
	}
	}
		  
		  
		  
		  
	    
	   