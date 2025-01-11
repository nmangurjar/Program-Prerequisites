import java.util.Random;

public class EmployeeBonus {

    //  generate random salary and years of service for 10 employees
    public static double[][] generateEmployeeData() {
        Random random = new Random();
        double[][] employeeData = new double[10][2]; // 2D Array to store salary and years of service

        for (int i = 0; i < 10; i++) {
            // Generate a random 5-digit salary
            employeeData[i][0] = 10000 + (random.nextDouble() * 90000); // Salary between 10000 and 99999

            // Generate random years of service (between 1 and 15)
            employeeData[i][1] = 1 + random.nextInt(15); // Years of service between 1 and 15
        }

        return employeeData;
    }

    //  calculate new salary and bonus based on years of service
    public static double[][] calculateBonus(double[][] employeeData) {
        double[][] updatedData = new double[10][3]; // 2D Array to store old salary, new salary, and bonus

        for (int i = 0; i < 10; i++) {
            double oldSalary = employeeData[i][0];
            int yearsOfService = (int) employeeData[i][1];
            double bonus = 0;
            double newSalary = oldSalary;

            // Apply bonus logic
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus for more than 5 years
            } else {
                bonus = oldSalary * 0.02; // 2% bonus for less than 5 years
            }

            // Calculate new salary after bonus
            newSalary += bonus;

            // Store old salary, new salary, and bonus in updatedData
            updatedData[i][0] = oldSalary;
            updatedData[i][1] = newSalary;
            updatedData[i][2] = bonus;
        }

        return updatedData;
    }

    //  calculate the total bonus, sum of old salaries, and sum of new salaries
    public static void calculateAndDisplayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;

        // Loop through the data to calculate sums
        for (int i = 0; i < 10; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }

        // Display the results in tabular format
        System.out.println("Employee  Old Salary     New Salary     Bonus     ");
        System.out.println("------------------------------------------------------------");
        for (int i = 0; i < 10; i++) {
            System.out.println((i + 1) + "         " + updatedData[i][0] + "       " + updatedData[i][1] + "       " + updatedData[i][2]);
        }

        // Display the totals
        System.out.println("------------------------------------------------------------");
        System.out.println("Total           " + totalOldSalary + "      " + totalNewSalary + "      " + totalBonus);
    }

    public static void main(String[] args) {
        // Generate random salary and years of service for 10 employees
        double[][] employeeData = generateEmployeeData();

        // Calculate bonus and new salary
        double[][] updatedData = calculateBonus(employeeData);

        // Calculate and display totals in tabular format
        calculateAndDisplayTotals(updatedData);
    }
}
