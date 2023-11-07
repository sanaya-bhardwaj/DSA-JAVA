package Conditional;
import java.util.Scanner;
public class divisibleby5 {
//take positive integer input and tell if it is divisible by 5 or not. 
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n= sc.nextInt();
		if(n%5==0) {
			System.out.println("Number is divisible by 5");
		}
		else {
			System.out.println("Number is not divisible by 5");
		}
		
	}

}
