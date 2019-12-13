package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

//		To print fibonacci series
            int num, nextTerm, prevTerm, prevprevTerm;
            Scanner sc = new Scanner(System.in);

            num = sc.nextInt();
            nextTerm =0;
            prevTerm =1;
            prevprevTerm = 0;
            for(int i = 0; i< num ; i++){
                if( i == 0){
                    nextTerm =0;
                    System.out.print(i);
                } else if( i == 1){
                    nextTerm =1;
                    System.out.print(", "+ i);
                }
                else{
                    nextTerm = prevTerm+ prevprevTerm;
                    prevprevTerm = prevTerm;
                    prevTerm = nextTerm;

                    System.out.print(", "+ nextTerm);
                }
            }


        }
    }

