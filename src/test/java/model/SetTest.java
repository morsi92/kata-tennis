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

    @Test
    void should_display_the_set_score() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedSetScore = playerOneName + " " + "4" + "\n" + playerTwoName + " " + "1";

        // When
        Set set = new Set(playerOne, playerTwo);
        playerOne.setSetScore(4);
        playerTwo.setSetScore(1);

        // Then
        Assertions.assertThat(set.getScore()).isEqualTo(expectedSetScore);
    }

    @Test
    void should_display_the_set_score_when_player_win_the_set() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedSetScore = playerOneName + " win the set";

        // When
        Set set = new Set(playerOne, playerTwo);
        playerOne.setSetScore(6);
        playerTwo.setSetScore(1);

        // Then
        Assertions.assertThat(set.getScore()).isEqualTo(expectedSetScore);
    }

    @Test
    void should_display_the_set_score_when_both_players_reach_five_games() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedSetScore = playerOneName + " " + "6" + "\n" + playerTwoName + " " + "5";

        // When
        Set set = new Set(playerOne, playerTwo);
        playerOne.setSetScore(6);
        playerTwo.setSetScore(5);

        // Then
        Assertions.assertThat(set.getScore()).isEqualTo(expectedSetScore);
    }

}