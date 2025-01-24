import java.util.*;

class Pallindrome {

public static boolean pallindrome(String s){
 
         int left =0;
		 int right = s.length()-1;
	    for(int i=0;i<s.length();i++){
			if(s.charAt(left) != s.charAt(right)){
		    return false ;
		 }
			}
		return true;
	}


    public static void main(String args[]) {
	
	 // Create a scanner object
        Scanner input = new Scanner(System.in);
	
	
	  // Take user input
	  System.out.print("Enter String: ");
	   String s = input.nextLine();
	 
	  boolean result = pallindrome(s);
	 
	 //Print the result
	 if(result == true ){
	 System.out.print("Pallindrome");
	 }else {
	 System.out.print("Not a pallindrome");
	 }
	 input.close();
        }
		}
		
	  
	   
	   