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

}