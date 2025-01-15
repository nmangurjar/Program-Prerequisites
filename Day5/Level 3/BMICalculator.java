
import java.util.Scanner;

public class BMICalculator {

    public static String[][] calculateBMIAndStatus(double[][] teamData) {
        String[][] result = new String[teamData.length][4];

        for (int i = 0; i < teamData.length; i++) {
            double weight = teamData[i][0];

            //Meter to cm
            double heightInMeters = teamData[i][1] / 100; 
            double bmi = weight / (heightInMeters * heightInMeters);

            String status;
            if (bmi < 18.5) {
                status = "Underweight";
            } else if (bmi < 24.9) {
                status = "Normal weight";
            } else if (bmi < 29.9) {
                status = "Overweight";
            } else {
                status = "Obese";
            }

            result[i][0] = String.format("%.2f", teamData[i][0]); // Weight
            result[i][1] = String.format("%.2f", teamData[i][1]); // Height
            result[i][2] = String.format("%.2f", bmi); // BMI
            result[i][3] = status; // Status
        }
        return result;
    }

    public static void displayTeamDetails(String[][] teamDetails) {
        System.out.printf("%-10s %-10s %-10s %-15s\n", "Weight(kg)", "Height(cm)", "BMI", "Status");
        for (String[] person : teamDetails) {
            System.out.printf("%-10s %-10s %-10s %-15s\n", person[0], person[1], person[2], person[3]);
        }
    }

    public static void main(String[] args) {
        //Create scanner object
        Scanner scanner = new Scanner(System.in);
        double[][] teamData = new double[10][2];

        for (int i = 0; i < 10; i++) {
            System.out.printf("Enter weight (kg) for person "+( i + 1));
            teamData[i][0] = scanner.nextDouble();
            System.out.printf("Enter height (cm) for person  "+( i + 1));
            teamData[i][1] = scanner.nextDouble();
        }

        //Calculate BMI and store 
        String[][] teamDetails = calculateBMIAndStatus(teamData);

        //Print the deatils
        displayTeamDetails(teamDetails);
    }
}
