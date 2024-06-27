import java.util.Scanner;
public class Main
{
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a Number: ");
		int num = sc.nextInt(); //1234
		
		//1.Using Algorithm
		
		int rev = 0;
		while(num!=0){
		    rev = rev*10 + num %10; //0*10+1234%10=4   4*10+123%10=43   430+2=432  4320+1=4321
		    num = num / 10; //1234/10=4    123/10=12   12/10=1   1/10=0
		}
		
		System.out.println("Reverse Number is:"+rev);
	}
}
