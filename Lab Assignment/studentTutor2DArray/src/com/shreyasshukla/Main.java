package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// student Tutor 2D Array
        int[][] scoredMarks = new int[4][];
        scoredMarks[0] = new int[5];
        scoredMarks[1] = new int[6];
        scoredMarks[2] = new int[3];
        scoredMarks[3] = new int[7];
        Scanner sc = new Scanner(System.in);
        for(int i=0;i<4;i++){
            for(int j=0;j<scoredMarks[i].length;j++){
                scoredMarks[i][j] = sc.nextInt();
            }
        }

        int[][] countOfSlowLearners = new int[4][];
        countOfSlowLearners[0] = new int[5];
        countOfSlowLearners[1] = new int[6];
        countOfSlowLearners[2] = new int[3];
        countOfSlowLearners[3] = new int[7];
        for(int i=0;i<4;i++){
            for(int j=0;j<countOfSlowLearners[i].length;j++){
                countOfSlowLearners[i][j] = 0;
            }
        }

        for(int i=0;i<4;i++){
            for(int j=0;j<scoredMarks[i].length;j++){
                System.out.print(scoredMarks[i][j] + " ");
            }
            System.out.println();
        }

    }
}
