import java.util.Scanner;

 class FactorialCalculator {

    public static int calculateFactorial(int num) {
        if (num == 0 || num == 1) {
            return 1;
        }
        return num * calculateFactorial(num - 1);
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number to calculate its factorial:");
        int num = scanner.nextInt();

        int result = calculateFactorial(num);
        System.out.println("The factorial of " + num + " is " + result);
    }
}
