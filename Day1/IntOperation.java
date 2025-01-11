import java.util.Scanner;
class IntOperation {
    public static void main(String[] args) {

        // Create Scanner object for user input
        Scanner input = new Scanner(System.in);


        //Create input variables a,b,c
        System.out.println("Ënter value of a : ");
        int a = input.nextInt();
        System.out.println("Ënter value of b : ");
        int b = input.nextInt();
        System.out.println("Ënter value of c : ");
        int c = input.nextInt();

        //Create result1, result2 , result3 and result4 to perform operation
        int result1 = a + b * c;
        int result2 = a * b + c;
        int result3 = c + a / b;
        int result4 = a % b + c;

        //Printing the results
        System.out.println("The results of Int Operations are "+result1+","+result2+","+result3+" and "+result4);


        input.close();
    }
}