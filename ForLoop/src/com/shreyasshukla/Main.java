package com.shreyasshukla;

public class Main {

    public static void main(String[] args) {
        for(int i = 2; i <= 8;i++){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f" , calculateInterest(10000.0, i)));
        }
        System.out.println("**************");
        for(int i = 8; i >= 2;i--){
            System.out.println("10,000 at " + i + "% interest = " + String.format("%.2f" , calculateInterest(10000.0, i)));
        }

        boolean primeOrNot = false;
        int primeCount = 0 ;
        for (int i =33 ; i<= 50 ; i++) {
            primeOrNot = isPrime(i);
            if(primeOrNot) {
                System.out.println("Prime number found : " + i);
                primeCount++;
            }
            if(primeCount == 3){
                break;
            }
        }
    }

    public static double calculateInterest(double amount , double interestRate){
        return amount * interestRate /100;
    }

    public static boolean isPrime(int n){
        if(n==1){
            return false;
        }
        for( int i = 2 ; i <= n/2 ; i++) {
            if( n % i == 0) {
                return  false;
            }
        }

        return true;
    }
}
