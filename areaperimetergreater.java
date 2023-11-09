package Conditional;
import java.util.Scanner;
public class areaperimetergreater {
//Given the length and breadth of a rectangle, write a program to find whether the area of the rectangle is greater than its perimeter 
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the length: ");
		int l= sc.nextInt();
		System.out.println("Enter the breadth: ");
		int b= sc.nextInt();
		int area=l*b;
		int perimeter=2*(l+b);
		//l=4
		//b=4
		//area=16
		//perimeter=16
		if(area>perimeter) {
			System.out.println("Area is greater than perimeter");
			
		}
		else { //if(perimeter>=area)
			System.out.println("Perimeter is greater than area");
		}
		
		

	}

}
