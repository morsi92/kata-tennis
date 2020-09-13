package model;

public class Set extends Score {

    private Game currentGame;

    public Set(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
        playerOne.setSetScore(0);
        playerTwo.setSetScore(0);
        currentGame = new Game(playerOne, playerTwo);
    }

    public String getScore() {
        if (currentGame.isEnded()) {
            if (tieBreakReached()) {
                currentGame = new TieBreakGame(playerOne, playerTwo);
            }
            currentGame = new Game(playerOne, playerTwo);
        }
        Player leadPlayer = getLeadPlayer();
        if (leadPlayer.getSetScore() >= 6 && Math.abs(playerOne.getSetScore() - playerTwo.getSetScore()) > 1) {
            return leadPlayer.winTheSet();
        }
        return display(playerOne.getSetScoreToDisplay(), playerTwo.getSetScoreToDisplay());
    }

    private boolean tieBreakReached() {
        return playerOne.getSetScore() == 6 && playerTwo.getSetScore() == 6;
    }

    Player getLeadPlayer() {
        return playerOne.getSetScore() >= playerTwo.getSetScore() ? playerOne : playerTwo;
    }

    public Game getCurrentGame() {
        return currentGame;
    }
}
