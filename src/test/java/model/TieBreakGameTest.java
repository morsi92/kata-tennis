package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class TieBreakGameTest {

    @Test
    void should_display_zero_when_tie_break_game_starts() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedGameScore = playerOneName + " " + "0" + "\n" + playerTwoName + " " + "0";

        // When
        TieBreakGame tieBreakGame = new TieBreakGame(playerOne, playerTwo);

        // Then
        Assertions.assertThat(tieBreakGame.getScore()).isEqualTo(expectedGameScore);
    }

    @Test
    void should_display_tie_break_game_score() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedGameScore = playerOneName + " " + "4" + "\n" + playerTwoName + " " + "2";

        // When
        TieBreakGame tieBreakGame = new TieBreakGame(playerOne, playerTwo);
        playerOne.setTieBreakScore(4);
        playerTwo.setTieBreakScore(2);

        // Then
        Assertions.assertThat(tieBreakGame.getScore()).isEqualTo(expectedGameScore);
    }

    @Test
    void should_display_tie_break_game_score_when_player_win_the_game() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedGameScore = playerOneName + " win the game";

        // When
        TieBreakGame tieBreakGame = new TieBreakGame(playerOne, playerTwo);
        playerOne.setTieBreakScore(7);
        playerTwo.setTieBreakScore(5);

        // Then
        Assertions.assertThat(tieBreakGame.getScore()).isEqualTo(expectedGameScore);
    }
    @Test
    void should_display_tie_break_game_score_when_player_win_the_game_with_more_than_seven_points() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedGameScore = playerOneName + " win the game";

        // When
        TieBreakGame tieBreakGame = new TieBreakGame(playerOne, playerTwo);
        playerOne.setTieBreakScore(10);
        playerTwo.setTieBreakScore(8);

        // Then
        Assertions.assertThat(tieBreakGame.getScore()).isEqualTo(expectedGameScore);
    }

}