 class NullPointer {

    // Method to generate NullPointerException
    public static void generateException() {
        String text = null;
        // This line will throw NullPointerException because text is null
        int length = text.length();
		
		// This line will not be reached
        System.out.println("Length of the text: " + length); 
    }

    // Method to demonstrate handling NullPointerException
    public static void handleException() {
        String text = null;
        
        // Using try-catch to handle the exception
        try {
            // This line will throw NullPointerException because text is null
            int length = text.length();
            System.out.println("Length of the text: " + length);
        } catch (NullPointerException e) {
		
            // Catching and handling the NullPointerException
			
            System.out.println("NullPointerException caught: Cannot call methods on a null object.");
        }
    }

    public static void main(String[] args) {
        //Call the method that generates NullPointerException
		
        System.out.println("Calling method to generate NullPointerException:");
        generateException();
        
        //Call the method that handles the NullPointerException
		
        System.out.println("Calling method to handle NullPointerException:");
        handleException();
    }
}
