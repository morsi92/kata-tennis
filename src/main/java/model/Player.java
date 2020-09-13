package model;

import static constants.Constants.*;

public class Player {
    private String name;
    private int gameScore;
    private int setScore;
    private int tieBreakScore;


    public Player(String name) {
        this.name = name;
        this.gameScore = 0;
        this.setScore = 0;
        this.tieBreakScore = 0;
    }

    int getGameScore() {
        return gameScore;
    }

    String getGameScoreString() {
        if (gameScore < 3) {
            return GAME_SCORE_TO_DISPLAY.get(gameScore);
        } else {
            return SCORE_40;
        }
    }

    String geGameScoreToDisplay() {
        return this.name + SPACE + getGameScoreString();
    }

    String geGameScoreToDisplay(String score) {
        return this.name + SPACE + score;
    }

    void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }

    void winsPoint() {
        System.out.println(name + " wins 1 point");
        this.gameScore++;
    }

    String winTheGame() {
        this.setScore++;
        return this.name + SPACE + WIN_THE_GAME;
    }

    String winTheSet() {
        return this.name + SPACE + WIN_THE_SET;
    }

    boolean hasSameGameScoreAs(Player player) {
        return this.gameScore == player.getGameScore();
    }

    void setSetScore(int setScore) {
        this.setScore = setScore;
    }

    void setTieBreakScore(int tieBreakScore) {
        this.tieBreakScore = tieBreakScore;
    }

    int getTieBreakScore() {
        return this.tieBreakScore;
    }

    public int getSetScore() {
        return this.setScore;
    }

    String getSetScoreToDisplay() {
        return this.name + SPACE + setScore;
    }

    String getTieBreakScoreToDisplay() {
        return this.name + SPACE + tieBreakScore;
    }
}
