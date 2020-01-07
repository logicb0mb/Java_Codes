package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// count of characters in a String
        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        char[] strArr=str.toCharArray();
        int count=0,arLength;

        arLength=strArr.length;

        for(int x=0; x<arLength; x++){
            char ch=strArr[x];
            for(int y=x+1; y<arLength; y++){
                if(strArr[y]==ch){
                    for(int z=y; z< arLength-1; z++)
                        strArr[z]=strArr[z+1];
                    arLength--;
                    y=x;
                }
            }
        }

        for(int x=0;x<arLength;x++){
            count=0;

            for(int y=0; y<strArr.length; y++){
                if(strArr[x]==str.charAt(y))
                    count++;
            }
            System.out.print(strArr[x]+""+count+"");

        }
    }
}
