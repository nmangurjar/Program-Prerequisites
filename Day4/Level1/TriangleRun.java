import java.util.Scanner;

class AthleteTriangle {
   
      // Method to calculate the number of rounds needed to complete 5 km
    public static int calculateRounds(int side1, int side2, int side3, double totalDistance) {
        int perimeter = side1 + side2 + side3; // Calculate perimeter of the triangle
       
        // km to meters
        return (int) Math.ceil(totalDistance * 1000 / perimeter); 
    }
}
    public static void main(String[] args) {
       
        Scanner sc = new Scanner(System.in);

        //take input from user
        System.out.print("Enter side 1 (meters): ");
        int side1 = sc.nextInt();

        System.out.print("Enter side 2 (meters): ");
        int side2 = sc.nextInt();

        System.out.print("Enter side 3 (meters): ");
        int side3 = sc.nextInt();

        // Print the result
        int rounds = calculateRounds(side1, side2, side3, 5.0);
        System.out.println("The athlete needs to complete " + rounds + " rounds to cover 5 km.");

        sc.close(); 
}
