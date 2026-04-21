import java.util.Random;

public class TicTacToe {

    static char currentPlayer;
    static char player1Symbol;
    static char player2Symbol;

    public static void main(String[] args) {

        // Perform toss
        toss();

        // Display result
        System.out.println("Player 1 Symbol: " + player1Symbol);
        System.out.println("Player 2 Symbol: " + player2Symbol);
        System.out.println("First Turn: Player " + (currentPlayer == player1Symbol ? "1" : "2"));
    }

    public static void toss() {
        Random rand = new Random();

        // 0 or 1
        int tossResult = rand.nextInt(2);

        if (tossResult == 0) {
            // Player 1 starts
            currentPlayer = 'X';
            player1Symbol = 'X';
            player2Symbol = 'O';
        } else {
            // Player 2 starts
            currentPlayer = 'X';
            player2Symbol = 'X';
            player1Symbol = 'O';
        }
    }
}