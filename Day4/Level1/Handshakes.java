import java.util.Scanner;

class MaxHandshakes {
      
        // Method to calculate maximum number of handshakes using combination formula
    public static int calculateHandshakes(int numberOfStudents) {
      
        return (numberOfStudents * (numberOfStudents - 1)) / 2;
    }

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        // take input from user
        
        System.out.print("Enter the number of students: ");
        int numberOfStudents = sc.nextInt();

        // Print the results
        int handshakes = calculateHandshakes(numberOfStudents);
        System.out.println("The maximum number of handshakes is: " + handshakes);

        sc.close();
    }
}
