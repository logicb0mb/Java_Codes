package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// binary to decimal and decimal to binary

        int decimalNumber, remainder,count = 0;
        Scanner sc = new Scanner(System.in);
        decimalNumber = sc.nextInt();
        int remarr[] = new int[50];
        while( decimalNumber != 0)
        {
            remainder = decimalNumber%2;
            remarr[count]=remainder;
            decimalNumber = decimalNumber/2;
            count++;
        }
        System.out.println("Binary Number:");
        for(int i = count; i>=0; i--){
            System.out.print(remarr[i]);
        }
        System.out.println();
        String binaryNumberInput;
        System.out.println("Please enter the binary number to be converted");
        binaryNumberInput = sc.next();
        System.out.println(Integer.parseInt(binaryNumberInput, 2));





        

    }
}
