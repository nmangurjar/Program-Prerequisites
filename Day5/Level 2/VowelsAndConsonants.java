import java.util.Scanner;

public class VowelsAndConsonants {

    // Convert the character to lowercase if it is an uppercase letter
	
    public static String toLowerCase(String str) {
	       String s = "";
        for(int i = 0; i<str.length();i++){
		  if(Character.isUpperCase(str.charAt(i))){
		     s+= (char)(str.charAt(i) + 32);
		  }
			 else {
			 s +=  str.charAt(i);
			 }
		}
			 return s ;
		    
    }
	   public static void checkVowelsAndConsonants(String str) {
	          int vowelCount = 0;
	          int consonantCount = 0;

        for(int i = 0; i<str.length();i++) {
			char ch = str.charAt(i);
			if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u') {
				vowelCount++;
			} else {
				consonantCount++;
			}
		}
			 System.out.println("Count of vowels : "+vowelCount);
			 System.out.print("Count of consonant : "+consonantCount);
		    
    }
    public static void main(String[] args) {
       
	   // Create a Scanner object 
        Scanner input = new Scanner(System.in);

        // Take input from user
        System.out.print("Enter a string: ");
        String str = input.nextLine();

         //Call toLowerCase method to convert string to lowercase
	      String s = toLowerCase(str);
		  
		  //call checkVowelsAndConsonantsb method to display the count of vowels and consonants
         checkVowelsAndConsonants(s);

        
    }
}
