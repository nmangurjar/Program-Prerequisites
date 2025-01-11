class FeeCalculation {
   public static void main(String[] args) {
   
   
   int fee = 125000;
   
   //Discount percentage
   int discountPercent = 10;
   
   // Calculate the discount amount
   double discount = (fee * discountPercent) / 100;
   
   // Calculate the final fee after the discount
   double finalFee = fee - discount;
   
   //Print the results
   System.out.println("The discount amount is INR " + discount + " and final discounted fee is INR " + finalFee);
	}
}
