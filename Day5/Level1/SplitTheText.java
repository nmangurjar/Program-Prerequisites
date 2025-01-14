import java.util.*; 

class SplitTheText{
    
	//Create a Method to split the text into words
    public static String[] splitText(String text){
	 ArrayList<String> words = new ArrayList<>(); 
	 StringBuilder word = new StringBuilder(); 
	 
	 for(int i=0; i<text.length(); i++){
	      char ch = text.charAt(i); 
		  if(ch == ' '){
		       if(word.length() > 0){	      
				  words.add(word.toString()); 
				  word.setLength(0); 
			      }
		  }else{
		  word.append(ch); 
		  }
	}	  
	// add the last word
	if (word.length() > 0) {
		words.add(word.toString());
	}

		 return words.toArray(new String[0]); 		 
	}
	
	 public static int findLength(String text){
	 
	 int textLength =0; 
	 for(char ch: text.toCharArray()){
		 textLength++; 
	 }
	return textLength; 
	}
	
	public static String[][] wordsLength( String [] text){
	
	  String[][] result = new String[text.length][2];
        for (int i = 0; i < text.length; i++) {
            result[i][0] = text[i];
            result[i][1] = String.valueOf(findLength(text[i]));
        }
        return result;
	
	
	}

   public static void main(String args[]){
       
	   Scanner input = new Scanner(System.in); 
	   
	   //Take user input 
	   String text = input.nextLine(); 
	   
	   
	   //call split words 
	   String[] words = splitText(text); 
	   
	   
	   String[][] allWordsLength = wordsLength(words); 
	   
	   System.out.println(" Word | Length "); 
	   for(int i=0; i<allWordsLength.length ; i++){
	       System.out.println(allWordsLength[i][0] + " | " + allWordsLength[i][1]); 	   
	   }
	   
	   
   }
}