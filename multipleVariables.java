package Basics;

public class multipleVariables {
	public static void main(String[] args) {
		int x,y,z; //3 dabbe create kar diye
		x=5;
		y=8;
		z=9;
		System.out.println("the value of x is "+ x);
		System.out.println("the value of y is "+y+100);
		z=10; //z value will get updated 
		z=x; //z ki value 5 ho jayegi
		z=x+y; 
		System.out.println("the value of z is "+z);
		
		System.out.println(x+y+z);// its addition!!
		System.out.println("!!!!"+x+y+z); //it will print numbers as text without addition
		System.out.println(x+y+" "+z); //first it will add x+y and then simply print z with it 
	}
}
