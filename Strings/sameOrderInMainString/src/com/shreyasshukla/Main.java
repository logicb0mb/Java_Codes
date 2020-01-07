package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// to check if a string appears in same order in another string
        String str, substr;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        substr = sc.nextLine();

        if(checkOrder(str,substr)){
            System.out.println("Yes the string appears in correct order");
        } else {
            System.out.println("No the string does not appear in correct order in another string");
        }


    }
    public static boolean checkOrder(String str, String substr){

        char strArr[]=str.toCharArray();
        char substrArr[]=substr.toCharArray();
        int pos=0;

        for(int i=0;i<strArr.length;i++){
            if(strArr[i]==substrArr[pos]){
                pos++;
                if(pos==substrArr.length)
                    return true;
            }
        }
        return false;
    }
}
