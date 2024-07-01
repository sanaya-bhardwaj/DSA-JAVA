//A palindrome String is A string that remains the same when its characters are reversed.
//For Example: MADAM

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a String:");
        String str = sc.nextLine();  // Use nextLine() to read the entire line
        String org_str = str;

        String rev = "";  // Initialize rev as an empty string
        int len = str.length();
        for (int i = len - 1; i >= 0; i--) {
            rev = rev + str.charAt(i);
        }

        if (org_str.equals(rev)) {
            System.out.println(org_str + " is a Palindrome String");
        } else {
            System.out.println(org_str + " is Not a Palindrome String");
        }
    }
}
