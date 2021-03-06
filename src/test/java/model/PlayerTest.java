package model;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

class PlayerTest {

    @Test
    void should_display_game_score_0() {
        // Given
        Player player = new Player("");
        player.setGameScore(0);

        // When
        String gameScore = player.getGameScoreString();

        // Then
        Assertions.assertThat(gameScore).isEqualTo("0");
    }

    @Test
    void should_display_game_score_15_when_player_wins_one_point() {
        // Given
        Player player = new Player("");
        player.setGameScore(1);

        // When
        String gameScore = player.getGameScoreString();

        // Then
        Assertions.assertThat(gameScore).isEqualTo("15");
    }

    @Test
    void should_display_game_score_30_when_player_wins_two_points() {
        // Given
        Player player = new Player("");
        player.setGameScore(2);

        // When
        String gameScore = player.getGameScoreString();

        // Then
        Assertions.assertThat(gameScore).isEqualTo("30");
    }

    @Test
    public void should_display_game_score_30_when_player_wins_three_points() {
        // Given
        Player player = new Player("");
        player.setGameScore(3);

        // When
        String gameScore = player.getGameScoreString();

        // Then
        Assertions.assertThat(gameScore).isEqualTo("40");
    }

}