//a=10 b=20 c=30
//a>b and a>c --> a is largest
//b>a and c>b -->b is largest
//c>a and c>b -->c is largest

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter First Number:");
        int a=sc.nextInt();
        
        System.out.println("Enter Second Number:");
        int b= sc.nextInt();
        
        System.out.println("Enter Third Number:");
        int c=sc.nextInt();
        
        //Approch1- logic 
        
        if(a>b && a>c){
            System.out.println(a+ "is Largest Number");
        } 
        else if(b>a && b>c){
            System.out.println(b+ "is largest Number");
        }
        else{
            System.out.println(c+ "is largest number");
        }      
    }
}