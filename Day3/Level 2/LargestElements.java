import java.util.*;

class LargestElements {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
 
        // take input from user
	  System.out.print("Enter the number :"); 
        int number = input.nextInt();
		
		
		int maxDigit =10; 
        int digits[] = new int[maxDigit];
			
		//an integer variable index with the value 0 to reflect the array index.
		int index=0; 
		
		
	//store the digits
		while(number != 0){   
		   int temp = number%10; 
		  
		   digits[index++] = temp; 
		   
		   //if the index count equals maxDigit then break out of the loop
		   if(index == maxDigit){ 
		      break; 
		   }
		    number /= 10; 
		}
		
		// sort the array
		Arrays.sort(digits);          
		 
      System.out.println("the largest digit is"+ digits[digits.length-1] +" and second largest number is : "+ digits[digits.length-2] ); 
     
      input.close(); 
    }
}