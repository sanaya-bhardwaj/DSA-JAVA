//Number =1234
//Sum=10

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num =1234;
        int sum = 0;
        
        while(num>0){
            sum=sum+num%10;
            num=num/10;
        }
        
        System.out.println("Sum of digits in a number:" +sum);

    }
}
