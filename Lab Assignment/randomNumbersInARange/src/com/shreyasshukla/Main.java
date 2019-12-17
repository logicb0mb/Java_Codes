package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// random number generation in a range

        int a, b,randomNumber;
        Scanner sc = new Scanner(System.in);
        a = sc.nextInt();
        b = sc.nextInt();
        if(a<=b){
            randomNumber = randomNumberGeneration(a,b);
        } else {
            randomNumber = randomNumberGeneration(b,a);
        }
        System.out.println("Random Number Genearted is:"+ randomNumber);

    }
    public static int randomNumberGeneration(int min, int max)
    {
        return (int) (Math.random() * (((max-min)+1))+min);
    }
}
