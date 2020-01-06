package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// rotational Palindrome Strings

        String str;
        Scanner sc  = new Scanner(System.in);
        str = sc.nextLine();
        boolean ifNot = false;
        for(int i = 1;i <str.length();i++){
            if( palindromeChecker(leftrotate(str,i))){
                ifNot = false;
                System.out.println("String "+ str+" is a rotational Palindrome");
                break;
            } else {
                ifNot = true;
            }
        }

        if(ifNot){
            System.out.println("String "+ str+" is NOT a rotational Palindrome");
        }


    }
    public static String leftrotate(String str, int d)
    {
        String ans = str.substring(d) + str.substring(0, d);
        return ans;
    }
    public static boolean palindromeChecker(String stringToBeChecked){


        String reverseString = new StringBuffer(stringToBeChecked).reverse().toString();

        if(stringToBeChecked.equals(reverseString))
        {
            //System.out.println("String "+ stringToBeChecked+" is a palindrome");
            return true;
        } else{
            return false;
        }
    }
}
