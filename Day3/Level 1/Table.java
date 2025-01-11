import java.util.Scanner;

class Table {
   public static void main(String[] args) {

       // Create a scanner object
       Scanner input = new Scanner(System.in);
      int number;
      int[] table = new int [10];

       // Take input from user
       System.out.print("Enter  Number : ");
             number = input.nextInt();
          
          
        
           for(int i=1;i<table.length;i++) {

                    table[i]= number*i;
              System.out.println( number+" * "+i+" = "+ table[i]);

            
               }

          input.close();
        
         }
         }
      
