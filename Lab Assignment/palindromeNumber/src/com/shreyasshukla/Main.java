package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// palindrome Number

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        String numberString = Integer.toString(n);

        String reverseNumber = new StringBuffer(numberString).reverse().toString();

        if(numberString.equals(reverseNumber))
        {
            System.out.println("Number is Palindrome");
        } else{
            System.out.println("Not a Palindrome");
        }
    }
}
