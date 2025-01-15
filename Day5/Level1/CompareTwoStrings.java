import java.util.*;

class CompareTwoStrings {

public static boolean isStringEqual(String s1 , String s2){
       boolean a = true;
  if(s1.length() != s2.length()){
       a = false ;
    }
	else {
	   for(int i=0;i<s1.length();i++){
	     if( s1.charAt(i)!=s2.charAt(i)){
		    a = false;
	          break;
			}
		}
		}

		return a;
		}


    public static void main(String args[]) {
	
	 // Create a scanner object
        Scanner input = new Scanner(System.in);
	
	
	// Take user input
	 System.out.print("Enter String 1: ");
	   String s1 = input.nextLine();
	 
	 System.out.print("Enter String 2: ");
	   String s2 = input.nextLine();
	   
	   
	   
	   boolean resultFromMethod = isStringEqual(s1 , s2);
	   
	   boolean resultFromBuiltIn =  s1.equals(s2);
	   
	   //Print the results
	  


		// print the result
		System.out.println("Result from both methods is : "+(resultFromMethod==resultFromBuiltIn));


		System.out.println("Result from user defined method is : "+resultFromMethod);
		System.out.println("Result from built in  method is : "+resultFromBuiltIn);
		
		
		input.close();
		
		}
		}
		
	  
	   
	   