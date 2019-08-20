package com.shreyasshukla;

public class Main {

    public static void main(String[] args) {
//	    int myMinValue = -2_147_483_648;
//        int myMaxValue = 2_147_483_647;
//
//        int myIntTotalHalf = (myMinValue + myMaxValue);
//
//        System.out.println(myIntTotalHalf);
//        byte myByteValue = -128;
//        byte myByteHalf = (byte) (myByteValue/2);
//        System.out.println(myByteHalf);
//
//        short myShortValue = -32767;
//        System.out.println(myShortValue);

        byte byteNumber = -63;
        short shortNumber = -32759;
        int intNumber = 98_413_153;

        long longNumber = 50000L + (10L * (byteNumber + shortNumber + intNumber));

        shortNumber = (short) (50000L + (10L * (byteNumber + shortNumber + intNumber)));
        System.out.println( "longNumber = "+ longNumber);
        System.out.println( "shortNumber = "+ shortNumber);

    }
}
