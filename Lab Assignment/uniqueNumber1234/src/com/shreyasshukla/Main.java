package com.shreyasshukla;

public class Main {

    public static void main(String[] args) {
	// unique number from 1,2,3,4
        int count = 0;
        for(int i = 1; i <= 4; i++){
            for(int j = 1; j <= 4; j++){
                for(int k = 1; k <= 4; k++){
                    if(k != i && k != j && i != j){
                        count++;
                        System.out.println(i + "" + j + "" + k);
                    }
                }
            }
        }

        System.out.println("Total 3 digit number possible from 1, 2, 3, 4 are:"+ count);
    }
}
