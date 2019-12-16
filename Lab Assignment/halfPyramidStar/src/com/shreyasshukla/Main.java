package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// half Pyramid Alphabets
        int n;
        char start = 'A';
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            for(int j  = 1 ; j <=i; j++){
                System.out.print(start);

            }
            start++;
            System.out.println();
        }


    }
}
