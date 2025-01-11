import java.util.Scanner;

public class HandshakeCalculator {
    public static void main(String[] args) {
      
	  // Create a Scanner 
        Scanner input = new Scanner(System.in);
        
        // Declare a variable for students
         int students;
        
        // Take input from user 
        System.out.print("Enter the number of students: ");
        students = input.nextInt();
        
            // Calculate the maximum number of handshakes
			
            int handshakes = (students * (students - 1)) / 2;
            
            //Print the result
            System.out.println("The maximum number of handshakes among "+students +" students is: "+ handshakes);
        }
        
      

    }

