import java.util.Scanner;

class lv2_problem7_BMI {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Take input for weight (in kg) and height (in cm)
        System.out.print("Enter weight (in kg): ");
        double weight = input.nextDouble();

        System.out.print("Enter height (in cm): ");
        double height = input.nextDouble();

        // Convert height from cm to meters
        height = height / 100;

        // Calculate BMI using the formula
        double bmi = weight / (height * height);

        // Display BMI and weight status
        System.out.printf("Your BMI is: %.2f\n", bmi);

        if (bmi <= 18.4) {
            System.out.println("You are Underweight.");
        } else if (bmi >= 18.5 && bmi <= 24.9) {
            System.out.println("You have Normal weight.");
        } else if (bmi >= 25 && bmi <= 39.9) {
            System.out.println("You are Overweight.");
        } else {
            System.out.println("You are Obese.");
        }

        input.close();
    }
}
