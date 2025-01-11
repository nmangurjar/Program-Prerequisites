import java.util.Scanner;

class YoungestAndTallestFriend {
    public static void main(String[] args) {

        // Create a scanner object
        Scanner input = new Scanner(System.in);

        //Create arrays for name
		String[] name = {"Amar","Akbar","Anthony"};

        //Create arrays for height and age
        double[] height = new double [3];
        int[] ages = new int [3];
		
		
		int youngestAge = Integer.MAX_VALUE;
		double tallestHeight = Integer.MIN_VALUE;
		int youngestName =0;
		int tallestName =0;
		
		
		
        //Take input from user
        System.out.print("Enter Ages of three friends : ");
		for(int i = 0;i<ages.length;i++){
		       ages[i]= input.nextInt();
			   }
			          
        System.out.print("Enter height of three friends : ");
		for(int i = 0;i<height.length;i++){
		       height[i]= input.nextDouble();
			   }
        
		//Find youngest and tallest friend 
		
		for(int i = 0;i<height.length;i++) {

			if (youngestAge > ages[i]) {
				youngestAge = ages[i];
				youngestName = i;
			}
			if (tallestHeight < height[i]) {
				tallestHeight = height[i];
				tallestName = i;
			}
		}
			// Print youngest and tallest friend
        System.out.print("Youngest friend is "+ name[youngestName]+" and tallest friend is "+name[tallestName]);
			
			
			
	    input.close();

    }
}



