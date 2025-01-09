import java.util.*;
class circle{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give Radius ");
	double radius;
	radius = sc.nextInt();
	
	double area = 3.141 * Math.pow(radius, 2) ;
	
	System.out.println("Area of circle = "+ area);
	}
	}