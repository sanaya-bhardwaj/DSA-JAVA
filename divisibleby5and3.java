package Conditional;
import java.util.Scanner;
//Take positive integer input and tell if it is divisible by 5 and 3
public class divisibleby5and3 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a Number");
		int n= sc.nextInt();
		if (n%5==0 && n%3==0) {
			System.out.println("The number is divisible by 5 and 3 ");
		}
		else {
			System.out.println("The number is not divisible by 5 and 3");
		}

	}

}
