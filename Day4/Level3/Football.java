import java.util.Random;

public class Football {
    public static void main(String[] args) {
        int[] heights = new int[11];
        Random random = new Random();

        // Generate random heights for 11 players in the range of 150 to 250 cm
        for (int i = 0; i < heights.length; i++) {
            heights[i] = 150 + random.nextInt(101); // Random height between 150 and 250
        }

        // Display the generated heights
        System.out.print("Heights of players in cm: ");
        for (int height : heights) {
            System.out.print(height + " ");
        }
        System.out.println();

        // Calculate results
        int shortestHeight = findShortestHeight(heights);
        int tallestHeight = findTallestHeight(heights);
        double meanHeight = findMeanHeight(heights);

        // Display results
        System.out.println("Shortest Height: " + shortestHeight + " cm");
        System.out.println("Tallest Height: " + tallestHeight + " cm");
        System.out.println("Mean Height: " + meanHeight + " cm");
    }

    //  find the sum of all heights
    public static int findSum(int[] heights) {
        int sum = 0;
        for (int height : heights) {
            sum += height;
        }
        return sum;
    }

    //  find the mean height
    public static double findMeanHeight(int[] heights) {
        int sum = findSum(heights);
        return (double) sum / heights.length;
    }

    //  find the shortest height
    public static int findShortestHeight(int[] heights) {
        int shortest = heights[0];
        for (int height : heights) {
            if (height < shortest) {
                shortest = height;
            }
        }
        return shortest;
    }

    //  find the tallest height
    public static int findTallestHeight(int[] heights) {
        int tallest = heights[0];
        for (int height : heights) {
            if (height > tallest) {
                tallest = height;
            }
        }
        return tallest;
    }
}
