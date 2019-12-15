package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// odd numbers divisible by 5 in the range 200 to 800
        int divisor, lowerBound, upperBound;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the divisor:");
        divisor = sc.nextInt();
        System.out.println("Please enter lower and upper bounds");
        lowerBound = sc.nextInt();
        upperBound = sc.nextInt();

        System.out.println("Odd Numbers divisible by "+ divisor +" between "+ lowerBound+ " and "+ upperBound + " are: ");
        for(int i = lowerBound; i< upperBound; i++){
            if( (i%2) != 0  && i%5 == 0 ){
                System.out.println(i);
            }
        }
    }
}
