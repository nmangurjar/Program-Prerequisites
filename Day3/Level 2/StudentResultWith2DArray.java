 import java.util.*;

class StudentResultWith2DArray {
    public static void main(String args[]) {

        Scanner input = new Scanner(System.in);

        // take input from user
        System.out.print("Enter the number of students :");
        int numberOfStudents = input.nextInt();

        //Create arrays to store marks, percentages, and grades of the students
        int[][] marks = new int[numberOfStudents][3];
        double[] percentage = new double[numberOfStudents];
        String[] grade = new String[numberOfStudents];

        int index = 0;
        while (index != numberOfStudents) {
            
			//Take input for marks of students in physics, chemistry, and maths.
            System.out.println(" Enter the marks of physics, chemistry, and maths out of 100 ");
            index++;
            int physics = input.nextInt();
			
			// If the marks are negative, ask the user to enter positive values and decrement the index
            if (physics < 0) {
                System.out.println("Enter again the valid marks :");
                index--;
                continue;
            }
            int chemistry = input.nextInt();
            if (chemistry < 0) {
                System.out.println("Enter again the valid marks :");
                index--;
                continue;
            }
            int maths = input.nextInt();
            if (maths < 0) {
                System.out.println("Enter again the valid marks :");
                index--;
                continue;
            }

            marks[index - 1][0] = physics;
            marks[index - 1][1] = chemistry;
            marks[index - 1][2] = maths;
            
			//Calculate the percentage 
            percentage[index - 1] = (marks[index - 1][0] + marks[index - 1][1] + marks[index - 1][2]) / 3;
            
			// grade of the students based on the percentage
            if (percentage[index - 1] <= 39)
                grade[index - 1] = "R";
            else if (percentage[index - 1] >= 40 && percentage[index - 1] <= 49)
                grade[index - 1] = "E";
            else if (percentage[index - 1] >= 50 && percentage[index - 1] <= 59)
                grade[index - 1] = "D";
            else if (percentage[index - 1] >= 60 && percentage[index - 1] <= 69)
                grade[index - 1] = "C";
            else if (percentage[index - 1] >= 70 && percentage[index - 1] <= 79)
                grade[index - 1] = "B";
            else
                grade[index - 1] = "A";

        }

        // print the marks, percentage and grade
        for (int i = 0; i < numberOfStudents; i++) {
            System.out.println("The marks of Student " + i + " is in physics : " + marks[i][0] + ", in chemistry : "
                    + marks[i][1] + " and in maths : " + marks[i][2] + ", percentage of student is : " + percentage[i]
                    + "%, and Grade of student is : " + grade[i]);
        }

        input.close();
    }
}