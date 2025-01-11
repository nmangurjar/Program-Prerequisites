class ProfitAndProfitPercent{
   public static void main(String[] args){
   
   int costPrice = 129;
   int sellingPrice = 191;
   
   //Calculating profit
   int profit = sellingPrice - costPrice;

   //Calculating profit percentage
   int profitPercentage = (profit * 100)/costPrice ;

   
   //Printing the calculated profit and profit Percentage
   System.out.println("The Cost Price is INR "+ costPrice + " and Selling Price is INR " + sellingPrice + " The Profit is INR " + profit + " and the Profit Percentage is "+ profitPercentage+"% .");
	
	}
	}