import java.util.*;
class temperature{
    public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	System.out.println("Give temperature in Celcius ");
	int celcius;
	celcius= sc.nextInt();
	
	int fahrenheit = (celcius * 9/5) + 32;
	
	System.out.println("Temperature in Fahrenheit  = "+ fahrenheit);
	}
	}