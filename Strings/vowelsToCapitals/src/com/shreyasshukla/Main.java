package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// vowels to UpperCase replacement in a string
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        String replacedString = "";

        for(int i = 0; i<str.length();i++){
            if(str.charAt(i)=='a'||str.charAt(i)=='e'||str.charAt(i)=='i'||str.charAt(i)=='o'||str.charAt(i)=='u'){
                replacedString = replacedString + Character.toUpperCase(str.charAt(i));
            } else{
                replacedString = replacedString + str.charAt(i);
            }
        }
        System.out.println(replacedString);
    }
}
