import java.util.Scanner;
class DoubleOperation {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);


        //Create input variables a,b,c
        System.out.println("Ënter value of a : ");
        double a = input.nextDouble();
        System.out.println("Ënter value of b : ");
        double b = input.nextDouble();
        System.out.println("Ënter value of c : ");
        double c = input.nextDouble();

        //Create result1, result2 , result3 and result4 to perform operation
        double result1 = a + b * c;
        double result2 = a * b + c;
        double result3 = c + a / b;
        double result4 = a % b + c;

        //Printing the results
        System.out.println("The results of double Operations are "+result1+","+result2+","+result3+" and "+result4);


        input.close();
    }
}