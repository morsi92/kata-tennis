import model.Player;
import model.Set;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        System.out.println("Please enter the first player name : ");
        String playerOneName = new Scanner(System.in).nextLine();
        System.out.println("Please enter the second player name : ");
        String playerTwoName = new Scanner(System.in).nextLine();

        Player playerOne = new Player(playerOneName);
        Player playerTwo = new Player(playerTwoName);
        Set set = new Set(playerOne, playerTwo);

        String setScore;

        do {
            set.getCurrentGame().scoreRandomPoint();
            System.out.println("Game score : \n" + set.getCurrentGame().getScore());
            setScore = set.getScore();
            System.out.println("Set score : \n" + setScore);
        } while (!set.isEnded());

    }
}
