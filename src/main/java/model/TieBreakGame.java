package model;

class TieBreakGame extends Score {

    TieBreakGame(Player playerOne, Player playerTwo) {
        this.playerOne = playerOne;
        this.playerTwo = playerTwo;
    }

    String getScore() {
        Player leadPlayer = getLeadPlayer();
        if (leadPlayer.getTieBreakScore() >= 7 && atLeastTwoPointsDifference()) {
            return leadPlayer.winTheGame();
        }
        return display(playerOne.getTieBreakScoreToDisplay(), playerTwo.getTieBreakScoreToDisplay());
    }

    private boolean atLeastTwoPointsDifference() {
        return Math.abs(playerOne.getTieBreakScore() - playerTwo.getTieBreakScore()) >= 2;
    }

    Player getLeadPlayer() {
        return playerOne.getTieBreakScore() >= playerTwo.getTieBreakScore() ? playerOne : playerTwo;
    }
}
