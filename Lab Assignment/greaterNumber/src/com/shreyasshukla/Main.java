package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// greater Number Comparision
        int a, b,c;
        Scanner sc = new Scanner(System.in);
        System.out.println("Input the first number:");
        a = sc.nextInt();
        System.out.println("Input the second number");
        b = sc.nextInt();
        System.out.println("Input the third number");
        c = sc.nextInt();

        if(b>a && c>b){
            System.out.println("true");
        } else{
            System.out.println("false");
        }
    }
    }

