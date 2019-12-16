package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// addition on loop
        double a,b, sum = 0;
        Scanner sc = new Scanner(System.in);
        while (true){
            System.out.println("PLease enter the two numbers:");
            a = sc.nextDouble();
            b = sc.nextDouble();
            sum = a+b;
            System.out.println("Addition of "+a+" and "+b+" is :"+sum);
        }
    }
}
