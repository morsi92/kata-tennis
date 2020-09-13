package model;

import static constants.Constants.GAME_SCORE_TO_DISPLAY;
import static constants.Constants.SCORE_40;

public class Player {
    private String name;
    private int gameScore;


    public Player(String name) {
        this.name = name;
        this.gameScore = 0;
    }

    public String getName() {
        return name;
    }

    public int getGameScore() {
        return gameScore;
    }

    public String getGameScoreString() {
        if (gameScore < 3) {
            return GAME_SCORE_TO_DISPLAY.get(gameScore);
        } else {
            return SCORE_40;
        }
    }

    public String geScoreToDisplay() {
        return this.name + " " + getGameScoreString();
    }

    public String geScoreToDisplay(String score) {
        return this.name + " " + score;
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    public void resetGameScore() {
        this.gameScore = 0;
    }

    public void winsPoint() {
        System.out.println(name + " wins 1 point");
        this.gameScore++;
    }

    public boolean hasSameGameScoreAs(Player player) {
        return this.gameScore == player.getGameScore();
    }
}
