package com.shreyasshukla;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        ArrayList<String> arrlist = new ArrayList<>();

        for(int i = 0; i< str.length();i++){
            for(int j = i;j<= str.length();j++){
                if(i!=j){
                    arrlist.add(str.substring(i,j));
                }

            }
        }
        System.out.println("All possible substrings are:");
        System.out.println(arrlist);
    }
}
