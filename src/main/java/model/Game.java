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
                return playerOne.geScoreToDisplay(DEUCE) + "\n" + playerTwo.geScoreToDisplay(DEUCE);
            } else {
                if (Math.abs(playerOne.getGameScore() - playerTwo.getGameScore()) == 1) {
                    if (playerOne.getGameScore() > playerTwo.getGameScore()) {
                        return playerOne.geScoreToDisplay("ADV") + "\n" + playerTwo.geScoreToDisplay("40");
                    } else {
                        return playerOne.geScoreToDisplay("40") + "\n" + playerTwo.geScoreToDisplay("ADV");
                    }

                } else {
                    playerOne.resetGameScore();
                    playerTwo.resetGameScore();
                    return leadPlayer.getName() + SPACE + WIN_THE_GAME;
                }

            }
        } else {
            return playerOne.geScoreToDisplay() + "\n" + playerTwo.geScoreToDisplay();
        }
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
