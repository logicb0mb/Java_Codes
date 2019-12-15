package com.shreyasshukla;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// display subjectName based on room number
        int roomNumber;
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter the room number:");
        roomNumber = sc.nextInt();

        if(roomNumber == 604){
            System.out.println("Java Programming");
        } else if( roomNumber == 605){
            System.out.println("Python Programming");
        } else {
            System.out.println("Invalid Input");
        }
    }
}
