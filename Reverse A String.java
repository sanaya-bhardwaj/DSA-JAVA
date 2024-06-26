//Solution1
//using + (string concatenation) operator 
//Java String concatenation operator (+) is used to add strings.
public class Main
{
	public static void main(String[] args) {
		String str="ABCD";
		String rev=" ";
		
		int len=str.length(); //4
		for (int i=len-1; i>=0; i--){ //3 //2//1//0//-1
		    rev=rev+str.charAt(i); //DCBA
		}
		System.out.println("Reverse string is:"+ rev);
		
	}
}


//solution2
//using character array

char a[]=str.toCharArray();
int len= a.length; //4

for(int i=len-1;i>=0;i++){
	rev = rev +a[i];
}


//solution3
//using String Buffer class

StringBuffer sb = new StringBuffer(str);
System.out.println(sb.reverse());
