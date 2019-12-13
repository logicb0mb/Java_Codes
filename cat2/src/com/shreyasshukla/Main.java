package com.shreyasshukla;
import java.util.Scanner;
class Main
{
    public static void main(String args[])
    {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        StringBuilder sb = new StringBuilder(str);
        StringBuilder temp = new StringBuilder("");

        for(int i=0;i<str.length();i++){
            if(str.charAt(i) != ' ') {
                temp.append(sb.charAt(i));
            }
        }
        System.out.println(temp);
    }
}
