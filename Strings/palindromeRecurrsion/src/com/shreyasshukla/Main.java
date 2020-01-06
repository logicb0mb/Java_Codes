package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// to check whether a string is palindrome or not using recurrsion
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        if(isPalindrome(str)){
            System.out.println(str+" is a palindrome");
        } else{
            System.out.println(str+" is NOT a palindrome");
        }
    }
    public static boolean isPalRec(String str, int s, int e)
    {

        if (s == e)
            return true;


        if ((str.charAt(s)) != (str.charAt(e)))
            return false;


        if (s < e + 1)
            return isPalRec(str, s + 1, e - 1);

        return true;
    }

    public static boolean isPalindrome(String str)
    {
        int n = str.length();

        if (n == 0)
            return true;

        return isPalRec(str, 0, n - 1);
    }
}
