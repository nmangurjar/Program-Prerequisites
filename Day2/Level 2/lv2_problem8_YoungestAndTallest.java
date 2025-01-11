// Program to find the youngest and tallest friends
import java.util.Scanner;

class lv2_problem8_YoungestAndTallest {
    public static void main(String[] args) {
        // Create a Scanner object for input
        Scanner input = new Scanner(System.in);

        // Take input for ages and heights of the 3 friends
        System.out.print("Enter the age of Amar: ");
        int amarAge = input.nextInt();
        System.out.print("Enter the height of Amar: ");
        int amarHeight = input.nextInt();

        System.out.print("Enter the age of Akbar: ");
        int akbarAge = input.nextInt();
        System.out.print("Enter the height of Akbar: ");
        int akbarHeight = input.nextInt();

        System.out.print("Enter the age of Anthony: ");
        int anthonyAge = input.nextInt();
        System.out.print("Enter the height of Anthony: ");
        int anthonyHeight = input.nextInt();

        // Finding the youngest friend
        int youngestAge = Math.min(amarAge, Math.min(akbarAge, anthonyAge));
        if (youngestAge == amarAge) {
            System.out.println("Amar is the youngest.");
        } else if (youngestAge == akbarAge) {
            System.out.println("Akbar is the youngest.");
        } else {
            System.out.println("Anthony is the youngest.");
        }

        // Finding the tallest friend
        int tallestHeight = Math.max(amarHeight, Math.max(akbarHeight, anthonyHeight));
        if (tallestHeight == amarHeight) {
            System.out.println("Amar is the tallest.");
        } else if (tallestHeight == akbarHeight) {
            System.out.println("Akbar is the tallest.");
        } else {
            System.out.println("Anthony is the tallest.");
        }

        // Close the Scanner
        input.close();
    }
}
