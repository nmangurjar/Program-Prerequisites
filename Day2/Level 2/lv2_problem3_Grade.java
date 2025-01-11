import java.util.Scanner;

class lv2_problem3_Grade {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input marks for three subjects
        System.out.print("Enter marks for Physics: ");
        int physics = input.nextInt();

        System.out.print("Enter marks for Chemistry: ");
        int chemistry = input.nextInt();

        System.out.print("Enter marks for Maths: ");
        int maths = input.nextInt();

        // Calculate total marks and percentage
        int totalMarks = physics + chemistry + maths;
        double percentage = (totalMarks / 3.0);

        // Determine the grade and remarks based on the percentage
        String grade;
        String remarks;

        if (percentage >= 80) {
            grade = "A";
            remarks = "(Level 4, above agency-normalized standards)";
        } else if (percentage >= 70) {
            grade = "B";
            remarks = "(Level 3, at agency-normalized standards)";
        } else if (percentage >= 60) {
            grade = "C";
            remarks = "(Level 2, below, but approaching agency-normalized standards)";
        } else if (percentage >= 50) {
            grade = "D";
            remarks = "(Level 1, well below agency-normalized standards)";
        } else if (percentage >= 40) {
            grade = "E";
            remarks = "(Level 1-, too below agency-normalized standards)";
        } else {
            grade = "R";
            remarks = "(Remedial standards)";
        }

        // Output the results
        System.out.printf("\nTotal Marks: %d\n", totalMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.println("Remarks: " + remarks);

        input.close();
    }
}
