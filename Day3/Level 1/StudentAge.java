
import java.util.Scanner;

class StudentAge {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner input = new Scanner(System.in);
		
		int[] ages = new int [10];

        // Take input from user
        System.out.print("Enter ages of students: ");
       for(int i=0;i<ages.length;i++){
	        ages[i]= input.nextInt();
			}
			 
			 //Printing the results
            for(int i=0;i<ages.length;i++){
			     if(ages[i]<=0){
				  System.out.print("Invalid Age");
            }
			else if(ages[i]>=18){
			System.out.println( "The student with the age "+ages[i]+" can vote.;");
           }
		   else{
			System.out.println( "The student with the age "+ages[i]+" cannot vote.;");
		   }
		   }
        


        input.close();
    }
}

