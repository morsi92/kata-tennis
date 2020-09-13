package model;

public class Set extends Score {

    Set(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        playerOne.setSetScore(0);
        playerTwo.setSetScore(0);
    }

    public String getScore() {
        return display(playerOne.getSetScoreToDisplay(), playerTwo.getSetScoreToDisplay());
    }
}
