import java.util.Scanner;

public class BMICalculator {

    // Method to calculate BMI

    public static double calculateBMI(double weight, double heightInCm) {
// Convert cm to meters
        double heightInMeters = heightInCm / 100;  
        // Convert cm to meters

        return weight / (heightInMeters * heightInMeters); 

    }

    // e BMI status
    public static String getBMIStatus(double bmi) {
        if (bmi < 18.5) {
           
            return "Underweight";
        } else if
         (bmi >= 18.5 && bmi < 24.9) {
            return "Normal weight";
        }
         else if (bmi >= 25 && bmi < 29.9) {
            return "Overweight";
        } else 
        {
            return "Obese";
        }
    }

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        //  store weight, height, and BMI 
        double[][] personData = new double[10][3];

        // Input for 10 persons: weight in kg and height in cm
        System.out.println("Enter weight (kg) and height (cm) for 10 persons:");

        for (int i = 0; i < 10; i++) {
            System.out.println("Person " + (i + 1) + ":");
            System.out.print("Weight (kg): ");
            personData[i][0] = scanner.nextDouble(); 

            System.out.print("Height (cm): ");
            personData[i][1] = scanner.nextDouble(); 

            
            personData[i][2] = calculateBMI(personData[i][0], personData[i][1]);
        }

        // Print the height, weight, BMI, and BMI status 
        System.out.println("\nDetails for each person:");
        for (int i = 0; i < 10; i++) {
            double bmi = personData[i][2];
            String status = getBMIStatus(bmi);
            System.out.print(status);
        }

       
        scanner.close();
    }
}
