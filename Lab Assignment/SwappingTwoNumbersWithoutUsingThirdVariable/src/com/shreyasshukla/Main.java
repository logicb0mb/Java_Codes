package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Swapping two numbers WITHOUT using third variable

        double numberOne, numberTwo;
        Scanner sc = new Scanner(System.in);
        numberOne = sc.nextDouble();
        numberTwo = sc.nextDouble();

        System.out.println("Values before swapping:");
        System.out.println("NumberOne: " + numberOne + ",  NumberTwo: "+ numberTwo);

        numberOne += numberTwo;
        numberTwo = numberOne - numberTwo;
        numberOne = numberOne - numberTwo;

        System.out.println("Values after swapping:");
        System.out.println("NumberOne: " + numberOne + ",  NumberTwo: "+ numberTwo);

    }
}
