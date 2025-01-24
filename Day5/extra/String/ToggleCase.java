import java.util.Scanner;

 class ToggleCase {

    // Method to toggle the case of each character in the string
    public static String toggleCase(String str) {
        StringBuilder result = new StringBuilder();
        
        // Iterate through each character in the string
		
        for (int i = 0; i < str.length(); i++) {
            char ch = str.charAt(i);
            
           		   // If character is uppercase, convert it to lowercase
            if (Character.isUpperCase(ch)) {
			
                result.append(Character.toLowerCase(ch));
            } 
            // If character is lowercase, convert it to uppercase
            else if (Character.isLowerCase(ch)) {
			
                result.append(Character.toUpperCase(ch));
            } 
          
            else {
                result.append(ch);
            }
        }
        
        return result.toString();
    }
    
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        
        //take input from user
       
	   System.out.print("Enter a string: ");
        String str = scanner.nextLine();
        
        // print the result
        String toggledString = toggleCase(str);
        System.out.println("String after toggling case: " + toggledString);
        
        scanner.close();
    }
}
