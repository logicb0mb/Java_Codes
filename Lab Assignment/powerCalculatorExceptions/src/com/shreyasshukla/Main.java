package com.shreyasshukla;

import java.util.Scanner;

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
        int number = 0, power = 0;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        power = sc.nextInt();
        long result;
        result = power(number,power);

    }

    public static long power(int n, int p){
        try{
            if(n<0 || p< 0){
                throw new MyException("java.lang.Exception: n and p should be non-negative");
            } else if(n==0 && p ==0){
                throw new MyException("java.lang.Exception: Both n and p should not be zero");
            } else {
                double initialNumber = n;
                for(int i = 1 ; i < p ; i++){
                    n *= initialNumber;
                }
                System.out.println(n);
                return n;
            }
        }catch (MyException exp){
            System.out.println(exp);
        }
        return n;
    }
}
