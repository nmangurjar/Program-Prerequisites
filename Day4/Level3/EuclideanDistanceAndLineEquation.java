import java.util.Scanner;

public class EuclideanDistanceAndLineEquation {

    // find the Euclidean distance between two points
    public static double calculateEuclideanDistance(double x1, double y1, double x2, double y2) {
        return Math.sqrt(Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2));
    }

    // find the equation of the line (slope and y-intercept)
    public static double[] calculateLineEquation(double x1, double y1, double x2, double y2) {
        double[] result = new double[2]; // result[0] is the slope, result[1] is the y-intercept
        
        // Calculating the slope (m)
        double m = (y2 - y1) / (x2 - x1);
        
        // Calculating the y-intercept (b)
        double b = y1 - m * x1;
        
        // Storing the slope and y-intercept in the result array
        result[0] = m;
        result[1] = b;
        
        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Taking user input for two points (x1, y1) and (x2, y2)
        System.out.print("Enter x1: ");
        double x1 = scanner.nextDouble();
        System.out.print("Enter y1: ");
        double y1 = scanner.nextDouble();
        System.out.print("Enter x2: ");
        double x2 = scanner.nextDouble();
        System.out.print("Enter y2: ");
        double y2 = scanner.nextDouble();

        // Calculating the Euclidean distance
        double distance = calculateEuclideanDistance(x1, y1, x2, y2);
        System.out.println("Euclidean distance between the points: " + distance);

        // Calculating the equation of the line
        double[] lineEquation = calculateLineEquation(x1, y1, x2, y2);
        System.out.println("Equation of the line: y = " + lineEquation[0] + "x + " + lineEquation[1]);

        scanner.close();
    }
}
