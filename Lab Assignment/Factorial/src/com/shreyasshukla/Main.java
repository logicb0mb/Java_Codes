package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Program to find factorial of a given number

        int n = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        System.out.println("Factorial of "+ n + " is :" + factorial(n));

    }

    public static double factorial(int n){
            if(n == 0 || n == 1){
                return 1;
            }

        return n * factorial(n-1);
    }
}
