import java.util.Scanner;

 class LowerCase {

    
    public static String lowerCase(String str) {
        
		   String s2 ="";
        
		// Iterate through each character in the string
		 for (int i = 0; i < str.length(); i++) {

             if (Character.isUpperCase(str.charAt(i))) {
                 s2 += (char) (str.charAt(i) + 32);
             }else{
                 s2+= str.charAt(i);
             }
         }
			return s2;
      
    }
    
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        
        //take input from user
       
	   System.out.print("Enter a string: ");
        String str = scanner.nextLine();
		
		String builtIn = str.toLowerCase();
		String userDefined = lowerCase(str);
        
        // print the result
        System.out.println("Result from both methods is : "+(builtIn.equals(userDefined)));
		
		
	   System.out.println("Result from user defined method is : "+userDefined);
        System.out.println("Result from built in  method is : "+builtIn);
       
		
        
        
        scanner.close();
    }
}
