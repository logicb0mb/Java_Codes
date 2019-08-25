package com.shreyasshukla;

public class Main {

    public static void main(String[] args) {

        double varOne = 20, varTwo = 80, mul25, rem;

        mul25 = (varOne + varTwo ) * 25;

        rem = mul25 % 40;
        if( rem <= 20){
            System.out.println("Total was over the limit!");
        }
    }
}
