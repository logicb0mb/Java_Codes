package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// to check whether a string is palindrome or not
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        palindromeChecker(str);
    }

    public static boolean palindromeChecker(String stringToBeChecked){

        String reverseString = new StringBuffer(stringToBeChecked).reverse().toString();

        if(stringToBeChecked.equals(reverseString))
        {
            System.out.println("String "+ stringToBeChecked+" is a palindrome");
            return true;
        } else{
            System.out.println("String "+ stringToBeChecked+" is not a palindrome");
            return false;
        }
    }
}
