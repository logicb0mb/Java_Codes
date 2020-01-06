package com.shreyasshukla;

import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// sorting array in min max form

            int n;
            Scanner sc = new Scanner(System.in);
            n = sc.nextInt();

            int arr[] = new int[n];
            for(int i = 0; i< n;i++){
                arr[i] = sc.nextInt();
            }

            System.out.println("Original Array ");
            System.out.println(Arrays.toString(arr));

            rearrange(arr,arr.length);
    }

    static void rearrange(int[] arr, int n)
    {

        int temp[] = new int[n];

        int small=0, large=n-1;



        boolean flag = true;


        for (int i=0; i<n; i++)
        {
            if (flag)
                temp[i] = arr[large--];
            else
                temp[i] = arr[small++];

            flag = !flag;
        }

        arr = temp.clone();


        System.out.println("Modified Array ");
        System.out.println(Arrays.toString(arr));
    }
}
