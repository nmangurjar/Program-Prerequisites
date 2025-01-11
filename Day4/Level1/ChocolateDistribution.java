import java.util.Scanner;

class ChocolateDistribution {
   
   
      // Method to calculate chocolates per child and remaining chocolates
    public static int[] distributeChocolates(int chocolates, int children) {
        int chocolatesPerChild = chocolates / children;
        int remainingChocolates = chocolates % children;
        return new int[] {chocolatesPerChild, remainingChocolates};
    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // take input from user

        System.out.print("Enter the number of chocolates: ");
        int chocolates = sc.nextInt();

        System.out.print("Enter the number of children: ");
        int children = sc.nextInt();

        // Print chocolates distribution
        int[] result = distributeChocolates(chocolates, children);
        System.out.println("Each child gets: " + result[0] + " chocolates");
        System.out.println("Remaining chocolates: " + result[1]);

        sc.close();
    }
}
