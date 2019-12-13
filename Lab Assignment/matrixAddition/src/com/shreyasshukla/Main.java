package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	    // Matrix Diagonal
        int column = 0 , row = 0;
        Scanner sc = new Scanner(System.in);
        row = sc.nextInt();
        column = sc.nextInt();

        double[][] arrayOne = new double[row][column];
        System.out.println("Please enter the values in matrixOne:");
        for (int i = 0 ; i < row ; i++){
            for(int j = 0; j < column; j++){
                arrayOne[i][j] = sc.nextDouble();
            }
        }


        System.out.println("MatrixOne:");
        for (int i = 0 ; i < row ; i++){
            for(int j = 0; j < column; j++){
                System.out.print(arrayOne[i][j] + " ");
            }
            System.out.println();
        }



        System.out.println("Diagonal of Matrix is:");
        for (int i = 0 ; i < row ; i++){
            for(int j = 0; j < column; j++){
                if( i == j ){
                    System.out.print(arrayOne[i][j] + " ");
                }

            }
            System.out.println();
        }
    }
}
