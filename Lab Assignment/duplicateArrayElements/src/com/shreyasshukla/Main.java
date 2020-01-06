package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// duplicate Array Elements
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];

        for(int i  =0 ;i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[0];
        for(int i = 0 ; i<n ;i++){
            for(int j = 0; j <n ;j++){
                if(arr[i] == arr[j]  && i != j ){
                    arr[j] = 0;
//                    System.out.println(arr[i]+" "+ arr[j]);
                }
            }
        }

        System.out.println("New array after removing duplicate elements is:");
        int count = 0;
        for(int i = 0; i<n ;i++){
            if(arr[i] != 0){
                count++;
                System.out.print(arr[i] + " ");
            }
        }
        System.out.println();
        System.out.println("New Length of the array is:"+ count);
    }
}
