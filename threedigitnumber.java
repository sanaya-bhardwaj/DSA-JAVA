package Conditional;
import java.util.Scanner;
public class threedigitnumber {
//Take positive integer input and tell if it is a three digit number or not
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the interger: ");
		int n= sc.nextInt();
		if (n>99 && n<1000) {
			System.out.println("this is a 3 digit number");
		}
		else {
			System.out.println("its not a 3 digit number");
		}

	}

}
