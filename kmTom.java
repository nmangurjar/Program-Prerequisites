	import java.util.*;
class distance{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give distance in kilometers  ");
	double distanceInKm;
	
	distanceInKm= sc.nextInt();

	
	double distanceInMiles = distanceInKm * 0.621371;
	
	System.out.println("Distance in miles is = "+ distanceInMiles);
	}
	}