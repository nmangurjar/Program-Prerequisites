import java.util.Scanner;

class SimpleInterest {
    // Method to calculate simple interest
    public static double SimpleInterest(double principal, double rate, double time) {
        return (principal * rate * time) / 100; 
    }

    public static void main(String[] args) {

        //Create scanner object
        Scanner input = new Scanner(System.in);

        // Taking user input for Principal 
        System.out.print("Enter Principal Amount: ");
          double principal = input.nextDouble();

        // Taking user input for Rate 

          System.out.print("Enter Rate of Interest: ");
        double rate = input.nextDouble();

       
        // Taking user input for Time in years
        System.out.print("Enter Time (in years): ");
            double time = input.nextDouble();

        //Printing the Simple Interest

        double interest = SimpleInterest(principal, rate, time);
        System.out.print("The Simple Interest is" +interest+ " for Principal " +principal+ " Rate " +rate+ " and "+time+" years");

        //Close scanner object
        input.close();
    }
}
