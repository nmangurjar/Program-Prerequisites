import java.util.Scanner;

public class YoungestAndTallest {

    // Method to find the youngest friend

    public static String findYoungest(int[] ages) {
        int youngestAge = Integer.MAX_VALUE;
        String youngestFriend = "";

        // find the youngest
        for (int i = 0; i < ages.length; i++) {
            if (ages[i] < youngestAge) {
                youngestAge = ages[i];
                if (i == 0) {
                    youngestFriend = "Amar";
                } else if (i == 1) {
                    youngestFriend = "Akbar";
                } else {
                    youngestFriend = "Anthony";
                }
            }
        }
        return youngestFriend;
    }

    // Method to find the tallest friend

    public static String findTallest(double[] heights) {
        double tallestHeight = Double.MIN_VALUE;
        String tallestFriend = "";

        // find the tallest
        for (int i = 0; i < heights.length; i++) {
            if (heights[i] > tallestHeight) {
                tallestHeight = heights[i];
                if (i == 0) {
                    tallestFriend = "Amar";
                } else if (i == 1) {
                    tallestFriend = "Akbar";
                } else {
                    tallestFriend = "Anthony";
                }
            }
        }
        return tallestFriend;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Arrays to store the ages and heights 
        
        int[] ages = new int[3];
        double[] heights = new double[3];

        // take for the ages and heights
        System.out.println("Enter the age and height for each friend:");

        // take age and height for Amar, Akbar, and Anthony
        for (int i = 0; i < 3; i++) {
            String friend = (i == 0) ? "Amar" : (i == 1) ? "Akbar" : "Anthony";
            System.out.print("Enter age of " + friend + ": ");
            ages[i] = scanner.nextInt();
            System.out.print("Enter height of " + friend + ": ");
            heights[i] = scanner.nextDouble();
        }

        //  methods to find the youngest and tallest friends
        String youngest = findYoungest(ages);
        String tallest = findTallest(heights);

        // Print the results
        System.out.println("The youngest friend is: " + youngest);
        System.out.println("The tallest friend is: " + tallest);

      
        scanner.close();
    }
}
