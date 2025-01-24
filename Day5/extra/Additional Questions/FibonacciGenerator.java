import java.util.Scanner;

 class FibonacciGenerator {

    public static void generateFibonacci(int terms) {
        int a = 0, b = 1;
        System.out.print("Fibonacci Sequence: " + a + " " + b);

        for (int i = 2; i < terms; i++) {
            int nextTerm = a + b;
            System.out.print(" " + nextTerm);
            a = b;
            b = nextTerm;
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the number of terms in the Fibonacci sequence:");
        int terms = scanner.nextInt();

        generateFibonacci(terms);
    }
}
