package com.shreyasshukla;

import java.util.Arrays;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static String[] molescounter( int[] arr, StringTokenizer tokenizer ){
        String[] arrtokens = new String[arr.length];
        for(int i = 0; i<=arr.length-1;i++) {
            String nextToken = tokenizer.nextToken();

            if( Character.isDigit(nextToken.charAt(0))){
                arrtokens[i] = nextToken.substring(1,nextToken.length());
                arr[i] = Integer.parseInt(Character.toString(nextToken.charAt(0)));
            } else {
                arrtokens[i] = nextToken;
                arr[i] = 1;
            }
        }
        return arrtokens;
    }
    public static void printOutput(int[] countArr, String[] stringArr){
        for(int i = 0; i < countArr.length;i++){
            if(i == countArr.length-1){
                System.out.print(countArr[i]+" moles of "+stringArr[i]+".");
            } else {
                System.out.print(countArr[i]+" moles of "+stringArr[i]+", ");
            }
        }
    }
    public static void main(String[] args) {
	// chemical reaction String
        String inputReaction = new String();
        String initialReactants = "";
        String productReactants = "";
        Scanner sc = new Scanner(System.in);
        inputReaction = sc.nextLine();
//        System.out.println("inputReaction:"+inputReaction);
        initialReactants = inputReaction.substring(0, inputReaction.indexOf("->"));
        productReactants = inputReaction.substring(inputReaction.indexOf("->")+3, inputReaction.length());
//        System.out.println("initialReactants:"+initialReactants);
//        System.out.println("productReactants:"+productReactants);

        StringTokenizer reactants = new StringTokenizer(initialReactants," + ");
        StringTokenizer products = new StringTokenizer(productReactants, " + ");
        int[] reactmoles = new int[reactants.countTokens()];
        int[] prodmoles = new int[products.countTokens()];

        String[] reactantsTokens = molescounter(reactmoles,reactants);
        String[] prodTokens = molescounter(prodmoles,products);

        System.out.println();
        System.out.print("Reactants are:");
        printOutput(reactmoles,reactantsTokens);

        System.out.println();
        System.out.println();

        System.out.print("Products are:");
        printOutput(prodmoles,prodTokens);


        System.out.println();



//        System.out.println("React moles array:"+ Arrays.toString(reactmoles));
//        System.out.println("Prod moles array:"+ Arrays.toString(prodmoles));
//
//        System.out.println("React array:"+ Arrays.toString(reactantsTokens));
//        System.out.println("Prod array:"+ Arrays.toString(prodTokens));
    }
}
