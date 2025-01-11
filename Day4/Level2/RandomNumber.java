import java.util.Random;

public class RandomNumber {

    // Method to generate an array of 4-digit random numbers

    public static int[] generate4DigitRandomArray(int size) {
        Random random = new Random();
        int[] numbers = new int[size];

        // Generate 4-digit random numbers
        for (int i = 0; i < size; i++) {
            numbers[i] = 1000 + random.nextInt(9000); 
        }

        return numbers;
    }

    // Method to find average, min and max value of an array
    public static double[] findAverageMinMax(int[] numbers) {
        int sum = 0;
        int min = numbers[0];
        int max = numbers[0];

        // Loop through the array to calculate sum, min, and max
        for (int num : numbers) {
            sum += num;
            min = Math.min(min, num);
            max = Math.max(max, num);
        }

        // Calculate average
        double average = (double) sum / numbers.length;

        // Return average, min, and max in a double array
        return new double[]{average, min, max};
    }

    public static void main(String[] args) {
        int size = 5;

        // 4-digit random numbers array
        int[] randomNumbers = generate4DigitRandomArray(size);

        // Find average, min, and max values
        double[] result = findAverageMinMax(randomNumbers);

        // Print the results
        System.out.println("Generated 4-digit random numbers:");
        for (int num : randomNumbers) {
            System.out.print(num + " ");
        }

        System.out.println("\n\nAverage: " + result[0]);
        System.out.println("Minimum: " + result[1]);
        System.out.println("Maximum: " + result[2]);
    }
}
