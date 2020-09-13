package model;

import static constants.Constants.*;

public class Player {
    private String name;
    private int gameScore;
    private int setScore;


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

    public String geGameScoreToDisplay() {
        return this.name + SPACE + getGameScoreString();
    }

    public String geGameScoreToDisplay(String score) {
        return this.name + SPACE + score;
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

    public void setSetScore(int setScore) {
        this.setScore = setScore;
    }

    public String getSetScoreToDisplay() {
        return this.name + SPACE + setScore;
    }
}
