package com.shreyasshukla;

import javax.sound.midi.SysexMessage;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        // pyramid Number

        int rows = 0, k = 0, count = 0, countOne = 0;
        Scanner sc = new Scanner(System.in);
        rows = sc.nextInt();

        for (int i = 1; i <= rows; ++i) {
            for (int space = 1; space <= rows - i; ++space) {
                System.out.print("  ");
                ++count;
            }
            while (k != 2 * i - 1) {
                if (count <= rows - 1) {
                    System.out.print((i + k) + " ");
                    ++count;
                } else {
                    ++countOne;
                    System.out.print((i + k - 2 * countOne) + " ");
                }
                ++k;
            }
            countOne = count = k = 0;
            System.out.println();
        }
    }
}
