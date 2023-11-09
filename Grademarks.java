package Conditional;
import java.util.Scanner;
public class Grademarks {
//Take input percentage of a student and print the grade according to marks 
	//1) 90-100 Excellent
	//2)80-90 very good 
	//3)70-80 good
	//4) 60-70 can do better
	//5) 50-60 average 
	//6) 40-50 below average 
	//7) <40 fail
	public static void main(String[] args) {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter the pertange: ");
		int percentage=sc.nextInt();
		if(percentage>90) {
			System.out.println("Grade:Excellent");
		}
		else if(percentage>80){
			System.out.println("Grade:very good");
			
		}
		else if(percentage>70) {
			System.out.println("Grade:good");
		}
		else if(percentage>60) {
			System.out.println("Grade:can do better");
		}
		else if(percentage>50) {
			System.out.println("Grade: average");
		}
		else if(percentage>40) {
			System.out.println("Grade: below average");
		}
		else {
			System.out.println("fail");
		}
	}

}
