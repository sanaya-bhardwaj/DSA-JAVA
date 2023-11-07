package Conditional;
import java.util.Scanner;
public class absolutevalue {
//take integer input and print the absolute value of integer
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter any integer: ");
		int n =sc.nextInt();
		if(n<0) { //if n is less than zero
			n=n*(-1); 
			
		}
		System.out.println("The absolute value is: "+n);
	}

}
