package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Pascal's Triangle
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        for(int i = 0; i<n ;i++)
        {
            for(int j = 1; j<= n-i;j++)
            {
                System.out.print(" ");
            }
            for(int j = 0; j<=i;j++)
            {
                System.out.print(combination(i,j)+" ");
            }
            System.out.println();
        }

    }
    public static int combination(int n, int r){
        return factorial(n)/ (factorial(r) * factorial(n-r));
    }
    public static int factorial(int n){
        if(n == 0 || n == 1)
        {
            return 1;
        } else{
            return n * factorial(n-1);
        }
    }
}
