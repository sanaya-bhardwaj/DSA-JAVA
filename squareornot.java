package Conditional;
import java.util.Scanner;
public class squareornot {
//input, length & breadth, find out square or not
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter lenght: ");
		int l=sc.nextInt();
		System.out.println("Enter Breadhth: ");
		int b=sc.nextInt();
		
		if(l== b){
			System.out.println("Its square");
		}
		else {
			System.out.println("its not a sqaure");
		}
	}

}
