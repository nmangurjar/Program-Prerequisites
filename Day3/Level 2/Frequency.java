import java.util.*;

class Frequency {


   public static void main(String args[]) {
       //create scanner object
       Scanner input = new Scanner(System.in);
	   
	   //Take input for number
       System.out.print("Enter a Number: ");
	   
	   //Create array to store digits
	   int digits[]= new int [10];
	   
	   
	   int count=0;
	   int temp;
	   while(number!=0){
	   temp = number%10;
	   digit[count] = temp;	
	   number = number/10;
	   count++;
	   }
	   
	    //Create a frequency array
	    int frequency[]= new int [10];
		
		for(int i=0;i<digits.length;i++){
			  frequency[digits[i]-'0']++;	   
	   }
	   }