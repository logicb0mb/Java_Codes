package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// series sum: n + nn + nnn

        int n, sum = 0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i=1;i<=n;i++)
        {
                sum += Math.pow(n,i);
        }
        System.out.println("Sum:" + sum);
    }
}
