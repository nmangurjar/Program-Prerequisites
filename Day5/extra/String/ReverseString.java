import java.util.*;

class ReverseString {

public static String reverseString(String s){

	String s1 = "" ;

	for(int i=s.length()-1;i>=0;i--){
		s1 += s.charAt(i);

			}

	return s1;

		}


    public static void main(String args[]) {
	
	 // Create a scanner object
        Scanner input = new Scanner(System.in);
	
	
	// Take user input
	 System.out.print("Enter String: ");
	   String s = input.nextLine();
	 
	  String result = reverseString(s);
	 
	 //Print the reversed string
	 System.out.print("Reversed String of "+s+" is " + result);
	 
	 
	
		
		input.close();
		
		}
		}
		
	  
	   
	   