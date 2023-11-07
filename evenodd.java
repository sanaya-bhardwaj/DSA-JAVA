package Conditional;
import java.util.Scanner;
public class evenodd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n =sc.nextInt();
		if (n%2==0) { //n even hai
			System.out.println("The number is even");
		}
		else { //if(n%2!=0) //n odd hai even nahi hai
			System.out.println("The number is odd");
		}
		
		

	}

}
