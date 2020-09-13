package model;

abstract class Score {
    Player playerOne;
    Player playerTwo;

    abstract String getScore();

    String display(String scoreOne, String scoreTwo) {
        return scoreOne + "\n" + scoreTwo;
    }

}
