package model;

class TieBreakGame extends Game {

    TieBreakGame(Player playerOne, Player playerTwo) {
        super(playerOne, playerTwo);
    }

    public String getScore() {
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
