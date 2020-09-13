package model;

import java.util.Random;

import static constants.Constants.*;

public class Game extends Score {

    private boolean ended;

    Game(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        ended = false;
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
                endGame();
                return leadPlayer.winTheGame();
            }
        }
        return display(playerOne.geGameScoreToDisplay(), playerTwo.geGameScoreToDisplay());

    }

    private void endGame() {
        this.ended = true;
    }

    boolean isEnded() {
        return ended;
    }

    private String deuce() {
        return display(playerOne.geGameScoreToDisplay(DEUCE), playerTwo.geGameScoreToDisplay(DEUCE));
    }

    private String advantageLeadPlayer(Player leadPlayer) {
        return leadPlayer == playerOne ? display(playerOne.geGameScoreToDisplay(ADVANTAGE), playerTwo.geGameScoreToDisplay()) :
                display(playerOne.geGameScoreToDisplay(), playerTwo.geGameScoreToDisplay(ADVANTAGE));
    }

    private boolean isOnePointDifference() {
        return Math.abs(playerOne.getGameScore() - playerTwo.getGameScore()) == 1;
    }

    Player getLeadPlayer() {
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
