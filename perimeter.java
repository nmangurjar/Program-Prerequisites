	import java.util.*;
class perimeter{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give length and width  ");
	double length,width;
	length= sc.nextInt();
	width= sc.nextInt();

	
	double perimeter = 2 * (length + width) ;
	
	System.out.println(" Perimeter of a rectangle is = "+ perimeter);
	}
	}