package Conditional;
//if cost price and selling price of an item is input through the keyboard, 
//write a program to determine whether the seller has made profit or incurred loss.
//Also determine how much profit he made or loss he incurred.
import java.util.Scanner;
public class profitloss {

	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the costprice: ");
		int cp= sc.nextInt();
		System.out.println("Enter the selling price: ");
		int sp= sc.nextInt();
		//sp-cp=profit & cp-sp=loss
		if(sp>cp) {
			System.out.println("PROFIT");
			System.out.print("Your profit is: Rs ");
			System.out.println(sp-cp);
		}
		else { //cp>sp---loss
			System.out.println("LOSS");
			System.out.print("Your loss is: Rs ");
			System.out.println(cp-sp);
		}
	}
	

}
