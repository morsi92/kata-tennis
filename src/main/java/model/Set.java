package model;

import static constants.Constants.*;

public class Set extends Score {

    Set(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        playerOne.setSetScore(0);
        playerTwo.setSetScore(0);
    }

    public String getScore() {
        Player leadPlayer = getLeadPlayer();
        if (leadPlayer.getSetScore() == 6 && Math.abs(playerOne.getSetScore() - playerTwo.getSetScore()) > 1) {
            return leadPlayer.getName() + SPACE + WIN_THE_SET;
        }
        return display(playerOne.getSetScoreToDisplay(), playerTwo.getSetScoreToDisplay());
    }

    Player getLeadPlayer() {
        return playerOne.getSetScore() >= playerTwo.getSetScore() ? playerOne : playerTwo;
    }
}
