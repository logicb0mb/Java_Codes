package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// divisble by 3 and 5

        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();

        if(number%3 == 0 && number%5 == 0 ){
            System.out.println(number + " is divisible by 3 and 5");
        } else{
            System.out.println(number + " is not divisible by 3 and 5");
        }
    }
}
