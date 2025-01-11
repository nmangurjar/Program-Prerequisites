import java.util.Scanner;

class FiveNumbers {
   public static void main(String[] args) {

       // Create a scanner object
       Scanner input = new Scanner(System.in);
     
      int[] numbers = new int [5];

       // Take input from user
       System.out.print("Enter five Numbers : ");
      for(int i=0;i<numbers.length;i++){
           numbers[i]= input.nextInt();
         }
        
           for(int i=0;i<numbers.length;i++) {

              if (numbers[i] > 0) {
                 if (numbers[i] % 2 == 0) {
                    System.out.println("The number " + numbers[i] + " is Positive and Even.");
                 } else {
                    System.out.println("The number " + numbers[i] + " is Positive and Odd.");
                 }
              } else if (numbers[i] < 0) {
                 System.out.println("The number " + numbers[i] + " is negative");
              } else {
                 System.out.println("The number " + numbers[i] + " is Zero");
              }
           }

           if(numbers[0]==numbers[numbers.length-1]){
              System.out.println("First and Last Number are equal");
           }
           else if(numbers[0]>numbers[numbers.length-1]){
              System.out.println("First number is greater than Last Number.");

           }
           else{
              System.out.println("First number is lesser than Last Number.");

           }
          input.close();
        
         }
         }
      

