
import java.util.*;

class MeanHeightPlayers  {
   public static void main(String args[]) {

       //Create scanner object
       Scanner input = new Scanner(System.in);

       double[] heights = new double[11];

      //take input from user
       System.out.println("Enter heights of players :");
       for(int i=0; i<11; i++){
           heights[i] = input.nextDouble();
       }

       double sum = 0.0;

       // Sum of all football players height
       for(int i=0; i<11; i++){
           sum +=  heights[i];
       }

       double meanHeight = sum/ 11;

       // print the result
       System.out.println(" The mean height of the football team : " + meanHeight);


       input.close();
   }
}

