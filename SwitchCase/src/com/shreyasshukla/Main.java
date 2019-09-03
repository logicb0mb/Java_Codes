package com.shreyasshukla;

import java.sql.SQLOutput;

public class Main {

    public static void main(String[] args) {
        char choice = 'Z';

        switch (choice) {
            case 'A' :
                System.out.println("Character is A");
                break;
            case 'B':
                System.out.println("Character is B");
                break;
            case 'C':
                System.out.println("Character is C");
                break;
            case 'D':
                System.out.println("Charcter is D");
            case 'E':
                System.out.println("Character is E");
            default:
                System.out.println("The Character is not one of A,B,C,D or E");
                break;
        }

        //***********
        // With JDK 7 we can now use Strings in switch case statement for comparison

        String month = "feBRuary";
        switch (month.toLowerCase()){
            case "january" :
                System.out.println("January Month!");
                break;
            case "february": case "march": case "june":
                System.out.println(month +"Month!");
                break;
            default:
                System.out.println("Enter a Month please 🙏🙏");
                break;
        }
    }
}
