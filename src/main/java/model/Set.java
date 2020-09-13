package model;

public class Set {
    private Player playerOne;
    private Player playerTwo;

    public Set(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        playerOne.setSetScore(0);
        playerTwo.setSetScore(0);
    }

    public String getScore() {
        return playerOne.getSetScoreToDisplay() + "\n" + playerTwo.getSetScoreToDisplay();
    }
}
