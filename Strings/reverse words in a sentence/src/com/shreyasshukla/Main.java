package com.shreyasshukla;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// reverse word in a string
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();
        int numberOfWords = 1;
        for(int i =0; i<str.length();i++){
            if(str.charAt(i) ==' '){
                numberOfWords++;
            }
        }
        List<Integer> arrOfIndex = new ArrayList<>();

        for(int i = 0; i < str.length(); i++) {
            if(str.charAt(i) ==' '){
                arrOfIndex.add(i);
            }
        }

//        System.out.println(arrOfIndex);
//        System.out.println(str.charAt(6));

        String[] arr = new String[numberOfWords];
        for(int i = 0; i< numberOfWords;i++){

            if(i ==0){
                arr[i] = str.substring(0,arrOfIndex.get(0));
               // System.out.println(arr[i]);
            } else if(i==numberOfWords-1){
                arr[i] = str.substring(arrOfIndex.get(i-1)+1,str.length());
               // System.out.println(arr[i]);
            }else {
                arr[i] = str.substring(arrOfIndex.get(i-1)+1,arrOfIndex.get(i) );
                //System.out.println(arr[i]);
            }
        }
        for(int i = numberOfWords-1; i>=0;i--){
            System.out.print(arr[i]+" ");
        }
    }
}
