public class TicTacToe {

    private char[][] board = {
        {' ', ' ', ' '},
        {' ', ' ', ' '},
        {' ', ' ', ' '}
    };

    public boolean validateMove(int row, int col) {

        // Boundary checking
        if (row < 0 || row > 2 || col < 0 || col > 2) {
            System.out.println("Invalid move: Out of bounds.");
            return false;
        }

        // Check if cell is empty
        if (board[row][col] != ' ') {
            System.out.println("Invalid move: Cell already occupied.");
            return false;
        }

        return true;
    }

    public boolean makeMove(int row, int col, char player) {
        if (validateMove(row, col)) {
            board[row][col] = player;
            return true;
        }
        return false;
    }

    // ✅ Proper main method
    public static void main(String[] args) {
        TicTacToe game = new TicTacToe();

        // Test moves
        System.out.println(game.makeMove(0, 0, 'X')); // true
        System.out.println(game.makeMove(0, 0, 'O')); // false (already occupied)
        System.out.println(game.makeMove(3, 1, 'X')); // false (out of bounds)
    }
}