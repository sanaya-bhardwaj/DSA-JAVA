package Conditional;
import java.util.Scanner;
public class leapyear {
//Any year is input through the keyboard. Write a program to determine whether the year is a leap year or not.(Considering leap year occurs after every 4 years)
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n=sc.nextInt();
		if(n%4==0) {
			System.out.println("its leap year!");
		}
		else {
			System.out.println("its not leap year");
		}
	}

}
