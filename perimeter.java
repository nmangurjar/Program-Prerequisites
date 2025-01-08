	import java.util.*;
class perimeter{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give length and width  ");
	double l,w;
	l= sc.nextInt();
	w= sc.nextInt();

	
	double c = 2 * (l + w) ;
	
	System.out.println(" Perimeter of a rectangle. is = "+ c);
	}
	}