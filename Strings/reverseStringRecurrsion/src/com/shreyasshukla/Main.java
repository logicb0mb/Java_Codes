package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// to reverse a string using recursion
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        reverseString(str);
    }
    public static void reverseString(String str){

        if(str.length()<1){
            System.out.print(str);
        } else{
            System.out.print(str.charAt(str.length() - 1));
            reverseString( str.substring(0, str.length() -1));
        }


    }
}
