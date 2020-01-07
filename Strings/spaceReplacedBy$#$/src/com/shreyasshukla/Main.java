package com.shreyasshukla;

import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) {
	// space replaced by $#$

        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        StringTokenizer st = new StringTokenizer(str);
        int count = st.countTokens();
        for(int i = 0; i< count-1;i++){
            System.out.print((st.nextToken())+"$#$");
        }
        System.out.println(getLastToken(str," "));;
    }
    public static String getLastToken(String strValue, String splitter )
    {
        String[] strArray = strValue.split(splitter);
        return strArray[strArray.length -1];
    }
}
