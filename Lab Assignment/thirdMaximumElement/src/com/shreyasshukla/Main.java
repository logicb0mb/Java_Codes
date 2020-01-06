package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// third Maximum Element Of an Array
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0;i < n;i++){
            arr[i] = sc.nextInt();
        }
        for(int j = 0; j<=2;j++){

            int max1 = arr[0];
            for(int i = 0; i< n; i++){
                if(arr[i] > max1){
//                    System.out.println("Maximum Element:"+ arr[i]);
                    max1 = arr[i];
                }
            }
            for(int i = 0; i<n ;i++){
                if(arr[i] == max1){
                    arr[i] = 0;
//                    System.out.println("Maximum Setted to 0");
                }
            }
//            System.out.println("Array After removing maximum:");
            for(int i = 0; i< n ;i++){
//                System.out.print(arr[i]+" ");
            }
            if(j == 2){
                System.out.println("Third Maximum Element:"+ max1);
            }

//            System.out.println("-----------------------------------------");
    }
}
}
