import java.util.Scanner;

class FeeCalculationWithInput {
   public static void main(String[] args) {
   
   //Create a Scanner object to take input from user 
        Scanner input = new Scanner(System.in);
		
   //Declare varaible for and discount
    int fee;
    int discountPercent;
   
   //Take input from user
    System.out.print("Enter the fee : ");
       fee = input.nextInt();
	  
 	System.out.print("Enter the Discount Percent : ");
       discountPercent = input.nextInt();
   
   // Calculate the discount amount
   double discount = (fee * discountPercent) / 100;
   
   // Calculate the final fee after the discount
   double finalFee = fee - discount;
   
   //Print the results
   System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	}
}
