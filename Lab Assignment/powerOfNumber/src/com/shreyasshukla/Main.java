package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// program to calculate power of number
        double number = 0, power = 0, initialNumber = 0 ;
        Scanner sc = new Scanner(System.in);
        number = sc.nextDouble();
        power = sc.nextDouble();
        initialNumber = number;
        for(int i = 1 ; i < power ; i++){
            number *= initialNumber;
        }
        System.out.println(power +" power of "+ initialNumber + " is : "+ number);
    }
}
