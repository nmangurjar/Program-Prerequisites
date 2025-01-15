 class StringIndexOutOfBoundsException {

    // Method to generate StringIndexOutOfBoundsException
    public static void generateException(String text) {
        
		
        // This line will throw StringIndexOutOfBoundException because we are trying to get index more than size of string
		    text.charAt(text.length()+1);
		
		// This line will not be reached
        System.out.println("Character at index 4 is  " +  text.charAt(text.length()+1)); 
    }

    // Method to handle StringIndexOutOfBoundException
    public static void handleException(String text) {
       
		// Using try-catch to handle the exception
        try {
           generateException(text);
           
        } catch (StringIndexOutOfBoundsException e) {
		
            // Catch and handle the indexOutOfBoundException
			
            System.out.println("StringIndexOutOfBoundException caught");
        }
    }

    public static void main(String[] args) {
		 // Create a scanner object 
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number or non-number ): ");
        String text = input.nextLine();
		
        //Call the method that generates StringIndexOutOfBoundException
		
        System.out.println("Calling method to generate StringIndexOutOfBoundException:");
        generateException (text);
        
        //Call the method that handles the indexOutOfBoundException
		
        System.out.println("Calling method to handle indexOutOfBoundException:");
        handleException(text);
    }
}
