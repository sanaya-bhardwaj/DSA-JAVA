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

//Using StringBuffer class

StringBuffer rev;
//creates a 'StringBuffer' object 'sb' initialized with the string representation of 'num'.
StringBuffer sb = new StringBuffer(String.valueOf(num)); //Convert Num to String 
StringBuffer rev=sb.reverse(); //Reverse the StringBuffer then print the reverse num 

//A StringBuffer in Java is a class used to create mutable (modifiable) string objects. 
//Unlike String objects, which are immutable (once created, their values cannot be changed), StringBuffer objects can be modified after they are created. 
//This makes StringBuffer particularly useful when you need to perform a lot of modifications on a string, such as appending, inserting, or reversing characters.

//Using String Builder 
StringBuilder sb1 = new StringBuilder();
sb1.append(num);
StringBuilder rev = sb1.reverse();

//StringBuilder in Java is similar to StringBuffer but is not synchronized, making it faster and more efficient for single-threaded environments. 
//It is used to create mutable strings, allowing you to modify the string content without creating new objects.
