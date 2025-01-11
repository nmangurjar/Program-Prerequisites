
import java.util.*;

class TwoDArrayToOne {

   public static void main(String args[]) {
       //create scanner object
       Scanner input = new Scanner(System.in);

       // take input from user
       System.out.println("Enter No Of rows");
       int rows = input.nextInt();
       System.out.println("Enter No Of columns");
       int columns = input.nextInt();

       // 2D Array
       int[][] matrix = new int[rows][columns];


       //Take input in 2D array
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               matrix[i][j] = input.nextInt();
           }
       }


       //1D Array
       int[] resultArray = new int[rows * columns];

       //define the index variable
       int index = 0;
       for (int i = 0; i < rows; i++) {
           for (int j = 0; j < columns; j++) {
               resultArray[index++] = matrix[i][j];
           }
       }


       // printing the resultArray
       for (int i = 0; i < resultArray.length; i++) {
           System.out.print(resultArray[i]+" , ");
       }


       input.close();
   }
}

