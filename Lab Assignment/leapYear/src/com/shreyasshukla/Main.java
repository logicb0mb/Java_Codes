package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// leap Year

        int year;
        Scanner sc = new Scanner(System.in);
        year = sc.nextInt();

        if( year %4 == 0){
            if(year%100 == 0){
                if(year %400 ==0){
                    System.out.println("Leap Year");
                } else {
                    System.out.println("Not a Leap Year");
                }
            }else{
                System.out.println("Leap Year");
            }
        }else
        {
            System.out.println("Not a Leap Year");
        }

    }
}
