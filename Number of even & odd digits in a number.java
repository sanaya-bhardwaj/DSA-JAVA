//Number=145678
//even digits:3
//odd digits:3

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int num =1234;
        int even_count = 0;
        int odd_count=0;
        while(num>0){
            int rem=num%10;
            
            if(rem%2==0){
                even_count++;
            }
            else{
                odd_count++;
            }
            num=num/10;
        }
        
        System.out.println("Number of Even Numbers:" +even_count);
        System.out.println("Number of odd Numbers:" +odd_count);
    }
}
