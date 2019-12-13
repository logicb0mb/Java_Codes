package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Swapping two numbers using third variable

        double numberOne, numberTwo, temp;
        Scanner sc = new Scanner(System.in);

        numberOne = sc.nextDouble();
        numberTwo = sc.nextDouble();

        System.out.println("Values before swapping:");
        System.out.println("NumberOne: " + numberOne + ",  NumberTwo: "+ numberTwo);

        temp = numberOne;
        numberOne = numberTwo;
        numberTwo = temp;

        System.out.println("Values after swapping:");
        System.out.println("NumberOne: " + numberOne + ",  NumberTwo: "+ numberTwo);

    }
}
