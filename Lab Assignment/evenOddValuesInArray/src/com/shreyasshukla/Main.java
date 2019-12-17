package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// even odd values in an array
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        n = sc.nextInt();
        int arr[] = new int[n];

        System.out.println("Enter the elements of the array:");
        for(int i = 0; i<n ;i++)
        {
            arr[i] = sc.nextInt();
        }

        System.out.println("Even Elemnets:");
        for(int i = 0; i< n; i++)
        {
            if(arr[i]%2 == 0)
            {
                System.out.print(arr[i]+ ", ");
            }
        }
        System.out.println();

        System.out.println("Odd Elemnets:");
        for(int i = 0; i< n; i++)
        {
            if(arr[i]%2 != 0)
            {
                System.out.print(arr[i]+ ", ");
            }
        }
    }

}
