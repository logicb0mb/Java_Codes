package com.shreyasshukla;
  
import java.sql.Array;
import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// Array Elements Rotation
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for(int i = 0; i<n;i++){
            arr[i] = sc.nextInt();
        }
        int temp = arr[n-1];
        int temp2 = arr[0];
        for(int i = 0; i<n;i++){
            if(i == 0){
                arr[i] = temp;
            } else{
                arr[i-1] = arr[i];
            }
        }
        arr[n-1] = temp2;
        System.out.println("Array Elements after rotation");
        System.out.println(Arrays.toString(arr));
    }
}
