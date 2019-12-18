package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// sum Test
        int a, b,c,sum;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        a = sc.nextInt();
        System.out.println("Input the second number");
        b = sc.nextInt();
        System.out.println("Input the third number");
        c = sc.nextInt();
        sum = a+b;

        if(sum == c){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
}
