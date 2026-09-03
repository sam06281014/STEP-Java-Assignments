// 1. Rock-Paper-Scissors Game
import java.util.Random;

public class D1_RockPaperScissorsGame {

    static final String[] MOVES = {"Rock", "Paper", "Scissors"};
    static Random random = new Random();

    // Available for a truly random computer move; the demo in main()
    // uses a fixed move list instead so the sample output is reproducible.
    static String generateComputerMove() {
        return MOVES[random.nextInt(3)];
    }

    static String playRound(String playerMove, String computerMove) {
        if (playerMove.equalsIgnoreCase(computerMove)) {
            return "Draw";
        }

        boolean playerWins =
                (playerMove.equalsIgnoreCase("Rock") && computerMove.equalsIgnoreCase("Scissors")) ||
                (playerMove.equalsIgnoreCase("Paper") && computerMove.equalsIgnoreCase("Rock")) ||
                (playerMove.equalsIgnoreCase("Scissors") && computerMove.equalsIgnoreCase("Paper"));

        return playerWins ? "Player Wins" : "Computer Wins";
    }

    public static void main(String[] args) {
        // Predefined moves for a deterministic live-demo run (N = 5 rounds)
        String[] playerMoves = {"Rock", "Paper", "Scissors", "Rock", "Paper"};
        String[] computerMoves = {"Scissors", "Paper", "Rock", "Scissors", "Scissors"};

        int wins = 0, losses = 0, draws = 0;

        System.out.println("Round | Player Move | Computer Move | Result");
        for (int i = 0; i < playerMoves.length; i++) {
            String result = playRound(playerMoves[i], computerMoves[i]);

            System.out.println((i + 1) + "     | " + playerMoves[i] + "       | " + computerMoves[i] + "      | " + result);

            if (result.equals("Player Wins")) {
                wins++;
            } else if (result.equals("Computer Wins")) {
                losses++;
            } else {
                draws++;
            }
        }

        double winPercentage = (wins * 100.0) / playerMoves.length;

        System.out.println();
        System.out.println("Final Summary (after " + playerMoves.length + " rounds)");
        System.out.println("Wins: " + wins + " | Losses: " + losses + " | Draws: " + draws + " | Win % = " + winPercentage + "%");
    }
}
