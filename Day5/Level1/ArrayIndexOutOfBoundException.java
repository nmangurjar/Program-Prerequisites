 class ArrayIndexOutOfBoundException {

    // Method to generate ArrayIndexOutOfBoundException
    public static void generateException() {
        int [] arr = new int [2];
		
        // This line will throw indexOutOfBoundException because size of array is 3 and here we are trying to set index 4
		    arr[3]= 12; 
		
		// This line will not be reached
        System.out.println("Number at index four is - " + arr[3]); 
    }

    // Method to demonstrate handling indexOutOfBoundException
    public static void handleException() {
       
        int [] arr = new int [2];
        
		// Using try-catch to handle the exception
        try {
            // This line will throw indexOutOfBoundException because text is null
             arr[3]= 12; 
        System.out.println("Number at index four is - " + arr[3]); 
           
        } catch (ArrayIndexOutOfBoundsException e) {
		
            // Catching and handling the indexOutOfBoundException
			
            System.out.println("indexOutOfBoundException caught");
        }
    }

    public static void main(String[] args) {
        //Call the method that generates indexOutOfBoundException
		
        System.out.println("Calling method to generate indexOutOfBoundException:");
        generateException ();
        
        //Call the method that handles the indexOutOfBoundException
		
        System.out.println("Calling method to handle indexOutOfBoundException:");
        handleException();
    }
}
