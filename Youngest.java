package Conditional;

//if the ages of ram, shyam, and ajay are input through the keyboard, write a program to determine the youngest of the three.
import java.util.Scanner;
public class Youngest {
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter Ram's Age: ");
		int Ram=sc.nextInt();
		System.out.println("Enter Shyam's Age: ");
		int Shyam=sc.nextInt();
		System.out.println("Enter Ajay's Age: ");
		int Ajay= sc.nextInt();
		if(Ram<Shyam && Ram<Ajay) {
			System.out.println(Ram+ " Ram is Youngest");
		}
		else if(Shyam<Ram && Shyam<Ajay) {
			System.out.println(Shyam+ " Shyam is Youngest");
		}
		else {
			System.out.println(Ajay+ " Ajay is Youngest");
		}
	}

}
