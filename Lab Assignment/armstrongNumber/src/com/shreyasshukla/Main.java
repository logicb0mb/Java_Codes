package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// armstrong Number
        int num, temp, sum,remainder;
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        temp = num;
        sum = 0;
        while ( num != 0){

            remainder = num%10;
            num /=10;
//            System.out.println(remainder);
            sum += Math.pow(remainder,3);
//            System.out.println(sum);
        }

//        System.out.println(sum);
//        System.out.println("Sum:"+ sum);

        if(temp == sum){
            System.out.println("Armstrong Number");
        } else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
