import java.util.Scanner;

class ReversedNumber {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner input = new Scanner(System.in);

       int number;

		System.out.print("Enter Number : ");
		  number = input.nextInt();

		//Create array to store digits
        int[] digit = new int [10];
		
        //Take input from user

	 
	    
    	 int temp;    
		 int count =0;
		 int i =0;
		while(number!=0){
		  temp = number % 10;
		  digit[i] = temp;
		  number = number / 10;
		  count++;
		  i++;
		  }
		
		
			// Print the array in reverse order
        	System.out.print("Reversed Number is : ");
			for(int j = 0; j<=count-1  ;j++) {
				System.out.print(digit[j]);
			}
			
			
	    input.close();

    }
}



