package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class SetTest {

    @Test
    void set_scores_should_be_zero_when_start_new_set() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedSetScore = playerOneName + " " + "0" + "\n" + playerTwoName + " " + "0";

        // When
        Set set = new Set(playerOne, playerTwo);

        // Then
        Assertions.assertThat(set.getScore()).isEqualTo(expectedSetScore);
    }

}