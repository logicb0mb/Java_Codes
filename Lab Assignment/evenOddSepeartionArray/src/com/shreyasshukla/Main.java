package com.shreyasshukla;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // to seperate even and odd numbers in an Array

        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();

        int arr[] = new int[n];
        int evencount = 0, oddcount = 0;
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
            if (arr[i] % 2 == 0) {
                evencount++;
            } else {
                oddcount++;
            }
        }
//        System.out.println("oddcount:"+oddcount);
        int evenarr[] = new int[evencount];
        int oddarr[] = new int[oddcount];
        int j = 0;
        while (j < evencount){
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 == 0) {
                    evenarr[j] = arr[i];
                    j++;
                }
            }
        }
        j = 0;
        while (j < oddcount){
            for (int i = 0; i < n; i++) {
                if (arr[i] % 2 != 0) {
//                    System.out.println("oddarr["+j+"] is:"+ oddarr[j]);
                    oddarr[j] = arr[i];
                    j++;
                }
            }
        }
//
//        System.out.println("Even Arraay:");
//        System.out.println(Arrays.toString(evenarr));
//        System.out.println("Odd Arraay:");
//        System.out.println(Arrays.toString(oddarr));

        System.out.println("Array after seperating even and odd numbers is:");
        int[]c = new int[evenarr.length+oddarr.length];
        int count = 0;

        for(int i = 0; i < evenarr.length; i++) {
            c[i] = evenarr[i];
            count++;
        }
        for(int k = 0; k < oddarr.length;k++) {
            c[count++] = oddarr[k];
        }
        for(int i = 0;i < c.length;i++) System.out.print(c[i]+" ");
    }
}
