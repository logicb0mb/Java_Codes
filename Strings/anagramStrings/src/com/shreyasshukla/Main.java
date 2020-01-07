package com.shreyasshukla;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// anagram Strings
        String str1, str2;
        Scanner sc = new Scanner(System.in);
        str1 = sc.nextLine();
        str2 = sc.nextLine();
        if(checkAnagrams(str1,str2)){
            System.out.println(str1+" and "+str2+" are anagrams.");
        } else {
            System.out.println(str1+" and "+str2+" are NOT anagrams.");
        }
    }

    public static boolean checkAnagrams(String str1, String str2){

        char[] charArr1 = new char[str1.length()];
        char[] charArr2 = new char[str2.length()];

        charArr1 = str1.toCharArray();
        charArr2 = str2.toCharArray();

        Arrays.sort(charArr1);
        Arrays.sort(charArr2);

        if(str1.length() != str2.length()){
            return false;
        }
        for(int i = 0; i< str1.length();i++){
            if(charArr1[i] != charArr2[i]){
                return false;
            }
        }
        return true;
    }
}
