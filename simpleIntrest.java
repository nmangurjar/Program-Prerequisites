import java.util.*;
class interest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give Principal, Rate, and Time  ");
	double p,r,t;
	p= sc.nextInt();
	r= sc.nextInt();
	t= sc.nextInt();
	
	double c = (p*r*t)/100 ;
	
	System.out.println("Simple Interest is = "+ c);
	}
	}