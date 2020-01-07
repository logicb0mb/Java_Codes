package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// changing case of string letters

        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String replacedString="";
        for(int i = 0; i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                replacedString = replacedString + Character.toLowerCase(str.charAt(i));
            } else {
                replacedString = replacedString + Character.toUpperCase(str.charAt(i));
            }
        }
        System.out.println(replacedString);

    }
}
