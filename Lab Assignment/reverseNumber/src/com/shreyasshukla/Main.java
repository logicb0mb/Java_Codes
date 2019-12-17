package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// reverse Number
        int n, reverse;
        Scanner sc = new Scanner(System.in);

        System.out.println("Please enter the number");
        n = sc.nextInt();

        String numberString = Integer.toString(n);
        String reverseNumberString = new StringBuffer(numberString).reverse().toString();
        reverse = Integer.parseInt(reverseNumberString);

        System.out.println("Reverse of the given number is :"+ reverse);
    }
}
