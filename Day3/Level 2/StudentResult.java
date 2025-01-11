 import java.util.*;

class StudentResult {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);
 
       // take input from user
	  System.out.print("Enter the number of students :"); 
        int numberOfStudents = input.nextInt();
        
        int[] marks = new int[numberOfStudents];
        double[] percentage = new double[numberOfStudents];
		String[] grade = new String[numberOfStudents];
        
		int index =0; 
        while(index != numberOfStudents){
		
System.out.println(" Enter the marks of physics, chemistry, and maths "); 
		     index++; 
		     int physics = input.nextInt(); 
			 if( physics < 0 ) {
			 System.out.println("Enter again the valid marks :");
			 index--; 
			 continue; 
			 }
			 int chemistry = input.nextInt(); 
			 if( chemistry < 0 ) {
			 System.out.println("Enter again the valid marks :");
			 index--; 
			 continue; 
			 }
			 int maths = input.nextInt();	 
			 if( maths < 0 ) {
			 System.out.println("Enter again the valid marks :");
			 index--; 
			 continue; 
			 }
			 
                   // total number of marks
			 marks[index-1] = physics+chemistry+maths; 
			 percentage[index-1] = marks[index-1]/3; 
			 
			 if(percentage[index-1] <= 39) grade[index-1] = "R"; 
			 else if(percentage[index-1] >= 40 && percentage[index-1] <= 49 ) grade[index-1] = "E"; 
			 else if(percentage[index-1] >= 50 && percentage[index-1] <= 59 ) grade[index-1] = "D"; 
             else if(percentage[index-1] >= 60 && percentage[index-1] <= 69 ) grade[index-1] ="C"; 
			 else if(percentage[index-1] >= 70 && percentage[index-1] <= 79 ) grade[index-1] = "B";
			 else grade[index-1] = "A";

		}
         
        // print the marks, percentage and grade 
        for (int i = 0; i < numberOfStudents; i++) {
        
		System.out.println("The marks of Student "+ i +" is : "+ marks[i] +", percentage of student is : "+ percentage[i] +"%, and Grade of student is : "+ grade[i] ); 		
		
        }
        

        input.close();
    }
}