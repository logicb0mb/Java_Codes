package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// full Pyramid Star

        int n;
        String star = "*", space = " ";
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();


        for(int i = 0; i<= n; i++)
        {
            if(i%2!=0) {
                for (int j = 1; j <= n - i; j++) {
                    System.out.print(space);
                }
                for (int k = 0; k <= i; k++) {

                    System.out.print(star + " ");
                }

                System.out.println();
            }

    }
    }}

