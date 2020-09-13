package model;

public class Game {
    private Player playerOne;
    private Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getScore() {
        return playerOne.geScoreToDisplay() + "\n" + playerTwo.geScoreToDisplay();
    }
}
