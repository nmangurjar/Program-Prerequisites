import java.util.Scanner;

public class PriceCalculator {
    public static void main(String[] args) {
       
	   // Create a Scanner object
        Scanner input = new Scanner(System.in);
        
        // Declare variables for unit price and quantity
        double unitPrice, totalPrice;
        int quantity;
        
        //Take input from user
        System.out.print("Enter the unit price of the item : ");
        unitPrice = input.nextDouble();
        
        System.out.print("Enter the quantity to be bought: ");
        quantity = input.nextInt();
        
        //Calculate the total price
        totalPrice = unitPrice * quantity;
        
        //Print the result
        System.out.println("The total purchase price is INR " +totalPrice + " if the quantity is " +quantity + " and unit price is INR " +unitPrice);
        
       
        input.close();
    }
}
