package com.shreyasshukla;

public class Main {

    public static void main(String[] args) {
        double result = calcFeetAndInchesToCentimeters(15,9);
        System.out.println(result);
        double result2 = calcFeetAndInchesToCentimeters(189);
        System.out.println(result2);
    }

    public static double calcFeetAndInchesToCentimeters(double feet, double inches){
        if (feet>=0){
            if (inches>=0 && inches<=12){
                double centiMeters;
                centiMeters = (inches * 2.54) + (feet * 12 * 2.54);
                return centiMeters;
            }
            return -1;
        }
        return -1;
    }
    public static double calcFeetAndInchesToCentimeters(double inches){
        if (inches >=0){
            double feets = (int) inches/12;
            double newInches =  inches - (feets * 12);
//            System.out.println("feets:" + feets);
//            System.out.println("newInches:" + newInches);
            return calcFeetAndInchesToCentimeters(feets,newInches);
        }
        return -1;
    }
}
