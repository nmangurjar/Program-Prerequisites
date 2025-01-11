import java.util.Random;

public class StudentScores {

    // Method to generate random 2-digit scores for Physics, Chemistry, and Math for students
    public static int[][] generateScores(int numStudents) {
        Random random = new Random();
        int[][] scores = new int[numStudents][3]; // 2D Array to store scores in Physics, Chemistry, and Math

        for (int i = 0; i < numStudents; i++) {
            // Generate random 2-digit scores for each subject
            scores[i][0] = 10 + random.nextInt(90); // Physics score
            scores[i][1] = 10 + random.nextInt(90); // Chemistry score
            scores[i][2] = 10 + random.nextInt(90); // Math score
        }

        return scores;
    }

    // Method to calculate total, average, and percentage for each student
    public static double[][] calculateScores(int[][] scores) {
        double[][] result = new double[scores.length][4]; // 2D Array to store total, average, and percentage

        for (int i = 0; i < scores.length; i++) {
            int total = scores[i][0] + scores[i][1] + scores[i][2];
            double average = total / 3.0;
            double percentage = (total / 300.0) * 100;

            // Round off the values to 2 decimal places
            result[i][0] = total;
            result[i][1] = Math.round(average * 100.0) / 100.0; // Rounding off to 2 decimals
            result[i][2] = Math.round(percentage * 100.0) / 100.0; // Rounding off to 2 decimals
        }

        return result;
    }

    // Method to display the scorecard of all students with their scores, total, average, and percentage
    public static void displayScorecard(int[][] scores, double[][] result) {
        System.out.println("Student\tPhysics\tChemistry\tMaths\tTotal\tAverage\tPercentage");
        System.out.println("------------------------------------------------------------");

        for (int i = 0; i < scores.length; i++) {
            System.out.println((i + 1) + "\t" + scores[i][0] + "\t\t" + scores[i][1] + "\t\t" + scores[i][2] + "\t"
                    + result[i][0] + "\t" + result[i][1] + "\t\t" + result[i][2]);
        }
    }

    public static void main(String[] args) {
        // Input the number of students
        java.util.Scanner scanner = new java.util.Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int numStudents = scanner.nextInt();
        scanner.close();

        // Generate random scores for the students
        int[][] scores = generateScores(numStudents);

        // Calculate total, average, and percentage for each student
        double[][] result = calculateScores(scores);

        // Display the scorecard in tabular format
        displayScorecard(scores, result);
    }
}
