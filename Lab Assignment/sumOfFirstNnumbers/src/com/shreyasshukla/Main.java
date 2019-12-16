package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// sum of first N numbers
        int n, sum = 0;
        Scanner sc =new Scanner(System.in);
        n = sc.nextInt();

        System.out.println("Sum of first n numbers is :");
        for (int i = 1; i<= n ;i++){
            sum += i;
        }
        System.out.println(sum);

    }
}
