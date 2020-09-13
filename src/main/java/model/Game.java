package model;

import java.util.Random;

import static constants.Constants.*;

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
            if (playerOne.hasSameGameScoreAs(playerTwo)) {
                return deuce();
            } else {
                if (isOnePointDifference()) {
                    return advantageLeadPlayer(leadPlayer);
                }
                return leadPlayerWin(leadPlayer);
            }
        }
        return display(playerOne.geScoreToDisplay(), playerTwo.geScoreToDisplay());

    }

    private String display(String scoreOne, String scoreTwo) {
        return scoreOne + "\n" + scoreTwo;
    }

    private String deuce() {
        return display(playerOne.geScoreToDisplay(DEUCE), playerTwo.geScoreToDisplay(DEUCE));
    }

    private String leadPlayerWin(Player leadPlayer) {
        playerOne.resetGameScore();
        playerTwo.resetGameScore();
        return leadPlayer.getName() + SPACE + WIN_THE_GAME;
    }

    private String advantageLeadPlayer(Player leadPlayer) {
        return leadPlayer == playerOne ? display(playerOne.geScoreToDisplay(ADVANTAGE), playerTwo.geScoreToDisplay()) :
                display(playerOne.geScoreToDisplay(), playerTwo.geScoreToDisplay(ADVANTAGE));
    }

    private boolean isOnePointDifference() {
        return Math.abs(playerOne.getGameScore() - playerTwo.getGameScore()) == 1;
    }

    private Player getLeadPlayer() {
        return playerOne.getGameScore() >= playerTwo.getGameScore() ? playerOne : playerTwo;
    }

    public void scoreRandomPoint() {
        int random = new Random().nextInt(2) + 1;
        switch (random) {
            case 1:
                playerOne.winsPoint();
                break;
            case 2:
                playerTwo.winsPoint();
                break;
            default:
                break;
        }
    }
}
