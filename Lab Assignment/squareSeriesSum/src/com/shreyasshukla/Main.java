package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// square series sum

        int n, sum =0;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Sum of the series is:");
        for(int i= 1;i<=n;i++){
//            System.out.println("power:"+ Math.pow(i,2));
            sum += Math.pow(i,2);
        }
        System.out.println(sum);
    }
}
