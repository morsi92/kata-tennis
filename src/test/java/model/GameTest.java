package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class GameTest {

    @Test
    public void when_game_starts_the_score_of_two_players_should_be_zero() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedGameScore = playerOneName + " " + "0" + "\n" + playerTwoName + " " + "0";

        // When
        Game game = new Game(playerOne, playerTwo);

        // Then
        Assertions.assertThat(playerOne.getGameScore()).isEqualTo("0");
        Assertions.assertThat(playerTwo.getGameScore()).isEqualTo("0");
        Assertions.assertThat(game.getScore()).isEqualTo(expectedGameScore);
    }

    @Test
    public void should_display_game_score() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedGameScore = playerOneName + " " + "30" + "\n" + playerTwoName + " " + "40";

        // When
        Game game = new Game(playerOne, playerTwo);
        playerOne.setGameScore(2);
        playerTwo.setGameScore(3);

        // Then
        Assertions.assertThat(game.getScore()).isEqualTo(expectedGameScore);
    }

    @Test
    public void should_display_game_winner() {
        // Given
        String playerOneName = "player one name";
        String playerTwoName = "player two name";
        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        String expectedGameScore = playerTwoName + "win the game";

        // When
        Game game = new Game(playerOne, playerTwo);
        playerOne.setGameScore(3);
        playerTwo.setGameScore(4);

        // Then
        Assertions.assertThat(game.getScore()).isEqualTo(expectedGameScore);
    }

}