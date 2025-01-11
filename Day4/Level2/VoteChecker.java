import java.util.Scanner;

public class VoteChecker {
   
    // Method to check if a student can vote 

    public static boolean canStudentVote(int age) {
        if (age < 0) {
           
             return false;
        }
       
        return age >= 18;
    }


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        // Array to store the ages 
        int[] ages = new int[10];
        
        // Take input
        for (int i = 0; i < ages.length; i++) {
            System.out.print("Enter age of student " + (i + 1) + ": ");
           
            ages[i] = sc.nextInt();
        }
        
        // Check if  student can vote
        for (int i = 0; i < ages.length; i++) {
            if (canStudentVote(ages[i])) {
             
             
                System.out.println("Student " + (i + 1) + " can vote.");
            } 
                 else {
                System.out.println("Student " + (i + 1) + " cannot vote.");
            }
        }
        
        sc.close();
    }
}
