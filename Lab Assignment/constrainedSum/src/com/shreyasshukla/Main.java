package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// sum of numbers between 10 and 50 divisible by 3
        int divisor, lowerBound, upperBound, sum = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the divisor:");
        divisor = sc.nextInt();
        System.out.println("Please enter lower and upper bounds");
        lowerBound = sc.nextInt();
        upperBound = sc.nextInt();

        for(int i = lowerBound; i< upperBound ; i++){
            if(i%3 == 0){
                sum += i;
//                System.out.println(i);
            }
        }
        System.out.println("Sum of all digits between "+ lowerBound + " and "+ upperBound + " which are divisible by "+ divisor + " is: "+ sum);
    }
}
