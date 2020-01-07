package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// abbrevation generator

        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String abbrevation = "";
        for(int i = 0; i< str.length();i++){
            if(i == 0){
                if(Character.isUpperCase(str.charAt(i))){
                    abbrevation = abbrevation + str.charAt(i) + ".";
                }
            }else if( str.charAt(i-1) == ' ' && Character.isUpperCase(str.charAt(i))){
                abbrevation = abbrevation + str.charAt(i) +".";
            }
        }

        System.out.println(abbrevation);
    }
}
