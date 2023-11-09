package Conditional;
import java.util.Scanner;
public class twodigitnumber {
//Take positive integer input and tell if it is a two digit number or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the interger: ");
		int n= sc.nextInt();
		if (n>9 && n<100) {
			System.out.println("this is a 2 digit number");
		}
		else {
			System.out.println("its not a 2 digit number");
		}

	}

}
