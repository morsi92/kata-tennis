package model;

public class Player {
    private String name;
    private int gameScore;


    public Player(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String getGameScore() {
        if (gameScore == 0) {
            return "0";
        } else {
            return "15";
        }
    }

    public String geScoreToDisplay() {
        return this.name + " " + "0";
    }

    public void setGameScore(int gameScore) {
        this.gameScore = gameScore;
    }
}
