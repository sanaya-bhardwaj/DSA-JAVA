package Conditional;
import java.util.Scanner;
//Take positive integer input and tell if it is divisible by 5 or 3 but not divisible by 15.
public class nested3and5butnot15 {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter a number: ");
		int n = sc.nextInt();
		if(n%5==0 || n%3==0) {
			if(n%15!=0) {
				System.out.println("The number is divisible by 3 or 5 but not 15");
			}
			else {
				System.out.println("Not matching the required condition");
			}
		}
		else {
			System.out.println("Not matching the required condition");
		}

	}

}
