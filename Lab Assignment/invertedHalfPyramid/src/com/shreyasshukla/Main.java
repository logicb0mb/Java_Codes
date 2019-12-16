package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// inverted HalfPyramid Numbers

        int n;

        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        for(int i = 1; i<= n; i++){
            for(int j  = 1 ; j <=n - i + 1; j++) {
                System.out.print(j);

            }
            System.out.println();
        }

    }
}
