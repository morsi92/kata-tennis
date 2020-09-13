package model;

public class TieBreakGame extends Score {

    private boolean ended;

    TieBreakGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        ended = false;
    }

    String getScore() {
        return display(playerOne.getTieBreakScoreToDisplay(), playerTwo.getTieBreakScoreToDisplay());
    }

    Player getLeadPlayer() {
        return null;
    }
}
