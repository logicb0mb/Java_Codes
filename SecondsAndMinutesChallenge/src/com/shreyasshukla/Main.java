package com.shreyasshukla;

public class Main {

    private static final String INVALID_VALUE_MESSAGE = "Invalid value";
    public static void main(String[] args) {
        String  toPrint;
        toPrint = getDurationString(61,00);
        System.out.println(toPrint);

        toPrint = getDurationString(22258);
        System.out.println(toPrint);
    }
    public static String getDurationString( int min, int sec) {
        String outputString, hoursString, minString, secString;


        if (min >= 0 && (sec >= 0 && sec <= 59)){
            int hours;
//            System.out.println("min"+min);
//            System.out.println("sec" + sec);
            hours = min/60;
            min = min%60;
            if(hours < 10){
                hoursString = "0" + hours + "h ";
            }else
            {
                hoursString = String.valueOf(hours) + "h ";
            }
            if(min < 10){
                minString = "0" + min + "m ";
            }else
            {
                minString = String.valueOf(min) + "m ";
            }
            if(sec < 10){
                secString = "0" + sec + "s";
            }else
            {
                secString = String.valueOf(sec) + "s";
            }
            outputString = hoursString +  minString + secString;
            return outputString;
        }
        return INVALID_VALUE_MESSAGE;
    }
    public static String getDurationString(int sec){
        if(sec >= 0 ){
            int min;
            String returnString;
            min = sec/60;
//            sec = sec%60;
            sec = sec - (min*60);
            returnString = getDurationString(min,sec);
            return returnString;
        }
        return INVALID_VALUE_MESSAGE;
    }
}
