package model;

import static constants.Constants.SPACE;
import static constants.Constants.WIN_THE_GAME;

public class Game {
    private Player playerOne;
    private Player playerTwo;

    public Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    public String getScore() {
        Player leadPlayer = getLeadPlayer();
        if (leadPlayer.getGameScore() > 3) {
            playerOne.resetGameScore();
            playerTwo.resetGameScore();
            return leadPlayer.getName() + SPACE + WIN_THE_GAME;
        } else {
            return playerOne.geScoreToDisplay() + "\n" + playerTwo.geScoreToDisplay();
        }
    }

    private Player getLeadPlayer() {
        return playerOne.getGameScore() >= playerTwo.getGameScore() ? playerOne : playerTwo;
    }
}
