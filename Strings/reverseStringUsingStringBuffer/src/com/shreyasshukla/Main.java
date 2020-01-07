package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// reverse String using String Buffer

        String str;
        Scanner sc = new Scanner(System.in);
        str = sc.nextLine();

        StringBuffer stb = new StringBuffer(str);
        String reveresedString  = stb.reverse().toString();
        System.out.println(reveresedString);
    }
}
