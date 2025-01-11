
import java.util.*;

class SumOfAllNumbers {
   public static void main(String args[]) {

       //Create Scanner object
       Scanner input = new Scanner(System.in);

       //Create Array
       double[] elements = new double[10];

       // CReate variable for total and index
       double total = 0;
       int index =0;

       //Take input from user
       System.out.println("Enter the Numbers : ");
       while(true){

           // Enter the Number
           double temp = input.nextDouble();

           if( index == 10 || temp <= 0 ){
               break;
           }

           elements[index++] = temp;
       }

       // Sum of all elements in total
       for(int i=0; i<index; i++){
           total += elements[i];
       }

       // print the result
       System.out.println("The total value is : "+ total);

       input.close();
   }
}

