package com.shreyasshukla;

import java.lang.reflect.Array;
import java.util.*;
public class Main
{
    public static void main(String a[])
    {
        int count = 0;
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();

        StringTokenizer st = new StringTokenizer(input);

        while (st.hasMoreTokens()){
            System.out.print(st.nextToken());
        }
    }
}


