import java.util.*;
class average{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give three no's  ");
	double p,r,t;
	p= sc.nextInt();
	r= sc.nextInt();
	t= sc.nextInt();
	
	double c = (p+r+t)/3 ;
	
	System.out.println("Avearage of three no's is = "+ c);
	}
	}