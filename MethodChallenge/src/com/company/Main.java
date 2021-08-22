package com.company;

public class Main {

    public static void main(String[] args) {
        int playerscore = calculateHighScorePosition(1500);
        displayHighScorePosition("playerOne",playerscore);
        playerscore = calculateHighScorePosition((900));
        displayHighScorePosition("playerTwo",playerscore);
        playerscore = calculateHighScorePosition((400));
        displayHighScorePosition("playerThree",playerscore);
        playerscore = calculateHighScorePosition(50);
        displayHighScorePosition("playerFour", playerscore);

    }

    public static  void displayHighScorePosition(String name,int pos){
        System.out.println(name + " managed to get into position " + pos + " on the high score table");
    }

    public static int calculateHighScorePosition(int score){
        if (score>=1000){
            return 1;
        }
        else if (score>=500){
            return 2;
        }
        else if (score>=100){
            return 3;
        }
        return 4;
    }
}
