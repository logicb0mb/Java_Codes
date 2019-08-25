package com.shreyasshukla;
import java.util.*;

public class Main {

    public static void main(String b[]) {

        Scanner sc = new Scanner(System.in);

        String name = sc.nextLine();
        char gender = sc.next().charAt(0);


        int age = sc.nextInt();
        long mobno = sc.nextLong();
        double cgpa = sc.nextDouble();

        System.out.println(name);
        System.out.println(gender);
        System.out.println(age);
        System.out.println(mobno);
        System.out.println(cgpa);


    }
}
