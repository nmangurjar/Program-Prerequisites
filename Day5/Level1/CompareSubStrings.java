import java.util.*;

class CompareSubStrings {

public static String subString(String s , int startIndex , int endIndex){
            String s2 = "";
 
	   for(int i=startIndex;i<endIndex;i++){
	          s2+=s.charAt(i);
			}
	
		return s2;

		}


    public static void main(String args[]) {
	
	 // Create a scanner object
        Scanner input = new Scanner(System.in);
	
	
	// Take user input
	 System.out.print("Enter String: ");
	   String s = input.nextLine();
	 
	 System.out.print("Enter start index: ");
	   int startIndex = input.nextInt();
	   
	   System.out.print("Enter end index: ");
	   int endIndex = input.nextInt();
	   
	   
	   String resultFromMethod = subString(s , startIndex , endIndex);
	   
	   String resultFromBuiltIn =  s.substring(startIndex,endIndex);

	   //Print the results
	  
	   if(resultFromMethod == resultFromBuiltIn ){
	    System.out.print("Result are different from both the methods ");
		}
		else {
	    System.out.print("Result are same from both the methods ");
		}
		System.out.println("Result from both methods is : "+(resultFromMethod.equals(resultFromBuiltIn)));


		System.out.println("Result from user defined method is : "+resultFromMethod);
		System.out.println("Result from built in  method is : "+resultFromBuiltIn);
		
		input.close();
		
		}
		}
		
	  
	   
	   