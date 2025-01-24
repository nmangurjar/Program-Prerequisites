import java.util.Scanner;

 class MaximumOfThree {

    public static int getInput() {
        Scanner scanner = new Scanner(System.in);
        return scanner.nextInt();
    }

    public static int findMaximum(int a, int b, int c) {
        return Math.max(a, Math.max(b, c));
    }

    public static void main(String[] args) {
        System.out.println("Enter three numbers:");
        int num1 = getInput();
        int num2 = getInput();
        int num3 = getInput();

        int max = findMaximum(num1, num2, num3);
        System.out.println("The maximum number is: " + max);
    }
}
