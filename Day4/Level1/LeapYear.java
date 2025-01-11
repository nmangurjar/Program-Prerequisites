import java.util.Scanner;

class LeapYear {
        
     // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);


    }

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        // take input from user
       
        System.out.print("Enter a year: ");
        int year = sc.nextInt();

        // Print the results
        if (isLeapYear(year)) {
            System.out.println(year + " is a Leap Year.");
        } 
        else 
        {
            System.out.println(year + " is not a Leap Year.");
        }

        sc.close(); 
    }
}
