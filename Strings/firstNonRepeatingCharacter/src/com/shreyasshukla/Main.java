package com.shreyasshukla;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// first non-repeating character in a string

        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        boolean[] singlearray = new boolean[str.length()];
        boolean[][] arr = new boolean[str.length()][str.length()];
        for(int i = 0; i< str.length(); i++){
            singlearray[i] = false;
            for(int j = 0; j< str.length();j++){
                arr[i][j] = false;
            }
        }



        for(int i = 0; i< str.length(); i++){
            for(int j = 0;j < str.length();j++){
                if((i!=j) && (str.charAt(i) != str.charAt(j))){
//                    System.out.println(str.charAt(i));
//                    System.out.println(str.charAt(j));
//                    System.out.println("===================================");
                    arr[i][j] = false;
                } else if(i!=j){
                    arr[i][j] = true;
                }
            }
        }

        for(int i = 0; i< str.length(); i++){
            if(Arrays.equals(arr[i], singlearray)){
                System.out.println("First non-repeating Character is: "+str.charAt(i));
                System.exit(0);
            }
        }
        System.out.println("All character repeat at least once");
    }
}
