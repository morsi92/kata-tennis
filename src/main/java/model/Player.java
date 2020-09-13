package model;

import java.util.Arrays;
import java.util.List;

public class Player {
    private String name;
    private int gameScore;

    public static final List<String> GAME_SCORE_TO_DISPLAY = Arrays.asList("0", "15", "30", "40");


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGameScore() {
        return GAME_SCORE_TO_DISPLAY.get(gameScore);
    }

    public String geScoreToDisplay() {
        return this.name + " " + "0";
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }
}
