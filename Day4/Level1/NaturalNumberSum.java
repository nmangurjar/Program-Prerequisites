import java.util.Scanner;

class NaturalSum {
        
    // Method to calculate the sum of n natural numbers
    public static int calculateSum(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }

        return sum;
    }

    public static void main(String[] args) {
      
        Scanner sc = new Scanner(System.in);

        // take input from user
       
        System.out.print("Enter a positive integer (n): ");
        int n = sc.nextInt();

        //print the sum
        int sum = calculateSum(n);
        System.out.println("The sum of first " + n + " natural numbers is: " + sum);

        sc.close();
    }
}
