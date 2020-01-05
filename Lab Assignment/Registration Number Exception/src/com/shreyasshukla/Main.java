package com.shreyasshukla;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

class MyException extends Exception{
    String str;
    public MyException(String s){
        str = s;
    }
    public String toString(){
        return str;
    }
}

public class Main {

    public static void main(String[] args) {
	    String regNo, mobNo;
        Scanner sc  = new Scanner(System.in);
        regNo = sc.next();
        mobNo = sc.next();

        System.out.println(regNo);
        System.out.println(mobNo);


        try {
            Pattern p = Pattern.compile("[0-9]{2}[A-Z/a-z]{3}[0-9]{4}", Pattern.CASE_INSENSITIVE);
            Matcher m = p.matcher(regNo);
            boolean b = m.find();
            Double mobNum = Double.parseDouble(mobNo);
            System.out.println(b);
            if(regNo.length() != 9){
                throw new MyException("java.lang.IllegalArgumentException: Registration number does not contain 9 characters");
            } else if(mobNo.length() != 10){
                throw new MyException("java.lang.IllegalArgumentException: Mobile number does not contain 10 characters");
            } else if(!b){
                throw new MyException("java.lang.NoSuchElementException: Registration Number does not follow regex");
            } else {
                System.out.println("Valid");
            }
        }catch (MyException ex){
            System.out.println("Invalid");
            System.out.println(ex);
        } catch (NumberFormatException exp){
            System.out.println("Invalid");
            System.out.println("java.lang.NumberFormatException: Mobile Number cannot contain any character other than a digit");

        }


    }
}
