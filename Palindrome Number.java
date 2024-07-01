//A palindrome number is a number that remains the same when its digits are reversed.
//For Example: 16461
import java.util.Scanner;
public class Main{
	public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    int num = sc.nextInt();
	    int org_num=num;
    	int rev=0;
	    while(num!=0){
	         rev=rev*10 + num%10;
	         num=num/10;
	    }
	    if (org_num==rev){
	        System.out.println(org_num+" Palindrome Number");
    	}
	    else {
	         System.out.println(org_num+" Not Palindrome Number");
	    }
    }
}
