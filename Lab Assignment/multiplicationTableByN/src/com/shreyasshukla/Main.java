package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// multiplication table by N

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Multiplication table of " + n + " is :");

        for(int i = 1; i<= 10; i++){
            System.out.print(n+ " x "+ i +" = ");
            System.out.print(i*n);
            System.out.println();
        }

    }
}
