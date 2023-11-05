package Basics;
import java.util.Scanner; //for input
public class takinginput {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in); //for input
		System.out.println("Enter radius:"); 
		int radius; //radius naam ka dabba 
		radius=sc.nextInt(); 
		//sc mein se integer ko input karo, toh radius mein input value store ho jayegi 
		double pi=3.1415;
		double area= pi*radius*radius;
		System.out.println("The area of circle is:" +area);//output final
	}

}
