import java.util.*;
class cylinder{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give Radius anf height ");
	double a,h;
	a= sc.nextInt();
	h= sc.nextInt();
	
	double c = 3.141 * a * a * h ;
	
	System.out.println("Volume of Cylinder = "+ c);
	}
	}