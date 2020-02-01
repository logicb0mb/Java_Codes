package com.shreyasshukla;

import java.util.Collections;
import java.util.LinkedList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<Integer>();
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num != 0){
            list.add(sc.nextInt());
            num--;
        }
        Collections.shuffle(list);
        System.out.println(list);
    }
}
