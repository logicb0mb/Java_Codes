package com.shreyasshukla;

public class Main {

    public static void main(String[] args) {
        int sum = 0, count =0;
        for(int i =1 ;i <= 1000 ; i++) {
            if( (i%3 ==0) && (i%5 == 0)){
                sum += i;
                count++;
                System.out.println("Number : " + i);
                if(count == 5) {
                    break;
                }
            }
        }
        System.out.println("SUM: "+ sum);
    }
}
