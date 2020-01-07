package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// substring in a string
        String str, substr;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        substr = sc.nextLine();

        str = str.toLowerCase();
        substr = substr.toLowerCase();

        int index = str.indexOf(substr);
        if(index != -1){
            System.out.println(str+" contains "+ substr+ " at the index: "+ index);
        } else{
            System.out.println(str+ " does not contains the substring "+ substr);
        }
    }
}
