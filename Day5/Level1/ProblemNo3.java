import java.util.Scanner;

 class ProblemNo3 {

    
    public static char[] charArray(String str) {
         
		 char [] result = new char[str.length()];
        
        
		// Iterate through each character in the string
		 for (int i = 0; i < str.length(); i++) {
            result[i] = str.charAt(i);
            }
			
			return result;
      
    }
    
    public static void main(String[] args) {
	
        Scanner scanner = new Scanner(System.in);
        
        //take input from user
       
	   System.out.print("Enter a string: ");
        String str = scanner.nextLine();
		
		char[] resultFromUserDefined = charArray(str);
		char[] resultFromBuiltin =  str.toCharArray();
        
        // print the result
	   System.out.println("Result from user defined method is : ");
        for (int i = 0; i < resultFromUserDefined.length; i++) {
            System.out.print(resultFromUserDefined[i]+" , ");
        }
        System.out.println();

        System.out.println("Result from built in  method is : ");
        for (int i = 0; i < resultFromBuiltin.length; i++) {
            System.out.print(resultFromBuiltin[i]+" , ");
        }
		
        
        
        scanner.close();
    }
}
