package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // full Pyramid Numbers

        int n,number;
        String space = " ";
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        number = 1;

        for (int i = 0; i <= n; i++) {

            for (int j = 1; j <= n - i; j++) {
                System.out.print(space);
            }
            for (int k = 0; k <= i; k++) {

                System.out.print(number + " ");
                number++;
            }

            System.out.println();

        }
    }
}
