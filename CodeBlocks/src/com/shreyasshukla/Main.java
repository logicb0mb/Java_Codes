package com.shreyasshukla;

public class Main {

    public static void main(String[] args) {
        boolean gameOver = true;
        int score = 80;
        int levelCompleted = 5;
        int bonus = 100;

        int secondScore = 10000;
        int secondlevelCompleted = 5;
        int secondbonus = 200;


        if (gameOver) {
            int finalScore = score + (levelCompleted * bonus);
            System.out.println("Your final score was:" + finalScore);

            int finalScoreTwo = secondScore + (secondlevelCompleted * secondbonus);
            System.out.println("Your final score was:" + finalScoreTwo);
        }

    }
}
