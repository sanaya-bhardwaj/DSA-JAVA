package Conditional;

import java.util.Scanner;

//Given a point (x,y), write a program to find out if it lies on the x-axis,y-axis or at the origin, viz. (0,0)
public class liesonxy0 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Value of x");
		int x=sc.nextInt();
		System.out.println("Value of y");
		int y=sc.nextInt();
		if (x==0 && y==0) {
			System.out.println("The point is origin");
		}
		else if(x==0) {
			System.out.println("The point lies on y-axis");
		}
		else {
			System.out.println("The point lies on x-axis");
		}
	}

}
