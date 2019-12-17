package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Floyd's Triangle
        int n, count = 1;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i <= n ;i++)
        {
            for(int j = 1; j <= i; j++)
            {
                System.out.print(count + " ");
                count++;
            }
            System.out.println();
        }
    }
}
