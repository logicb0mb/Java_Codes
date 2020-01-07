package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// changing case of string letters using ASCII values
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        String replacedString="";
        for(int i = 0; i<str.length();i++){
            if(Character.isUpperCase(str.charAt(i))){
                int tobeReplaced = str.charAt(i)+32;
                char typeCasted = (char) tobeReplaced;
                replacedString = replacedString +typeCasted ;
            } else if(str.charAt(i) == ' '){
                replacedString = replacedString +" ";
            }else {
                int tobeReplaced = str.charAt(i)-32;
                char typeCasted = (char) tobeReplaced;
                replacedString = replacedString +typeCasted ;

            }
        }
        System.out.println(replacedString);

    }
    }

