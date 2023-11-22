package Conditional;
//Take integer input & tell if it is a 2 digit number
import java.util.Scanner;
public class digitnumber2 {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		if (n>9 && n<100) {
			System.out.println("This is a 2 digit number");
		}
		else {
			System.out.println("It is not a 3 digit number");
		}

	}

}
