import model.Game;
import model.Player;

import java.util.Scanner;

import static constants.Constants.WIN_THE_GAME;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the first player name : ");
        String playerOneName = new Scanner(System.in).nextLine();
        System.out.println("Please enter the second player name : ");
        String playerTwoName = new Scanner(System.in).nextLine();

        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        Game game = new Game(playerOne, playerTwo);

        String gameScore = game.getScore();
        System.out.println(gameScore);

        do {
            game.scoreRandomPoint();
            gameScore = game.getScore();
            System.out.println(gameScore);
        } while (!gameScore.contains(WIN_THE_GAME));

    }
}
