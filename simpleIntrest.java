import java.util.*;
class interest{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give Principal, Rate, and Time  ");
	double principle,rate,time;
	principle= sc.nextInt();
	rate= sc.nextInt();
	time= sc.nextInt();
	
	double simpleInterest = (principle*rate*time)/100 ;
	
	System.out.println("Simple Interest is = "+ simpleInterest);
	}
	}