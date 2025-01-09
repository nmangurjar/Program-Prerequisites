import java.util.*;
class cylinder{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give Radius and height ");
	double radius,height;
	radius= sc.nextInt();
	height= sc.nextInt();
	
	double volume = 3.141 * radius * radius * height ;
	
	System.out.println("Volume of Cylinder = "+ volume);
	}
	}