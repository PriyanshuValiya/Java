public class NQueens {
    public static boolean isSafe(char board[][], int row, int col) {
        // up
        for (int i = row - 1; i >= 0; i--) {
            if (board[i][col] == 'Q') {
                return false;
            }
        }

        // up left diag
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        // up right diag
        for (int i = row - 1, j = col + 1; i >= 0 && j < board[0].length; i--, j++) {
            if (board[i][j] == 'Q') {
                return false;
            }
        }

        return true;
    }

    public static void nQueens(char board[][], int row) {
        if (row == board.length) {
            printBoard(board);
            count++;
            return;
        }
        for (int j = 0; j < board[0].length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                nQueens(board, row + 1);
                board[row][j] = '_';
            }
        }
    }

    public static void printBoard(char board[][]) {
        System.out.println("--------------");
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static boolean checkNQueens(char board[][], int row) {
        if (row == board.length) {
            return true;
        }
        // cols
        for (int j = 0; j < board[0].length; j++) {
            if (isSafe(board, row, j)) {
                board[row][j] = 'Q';
                if (checkNQueens(board, row + 1)) {
                    return true;
                }
                board[row][j] = '_';
            }
        }
        return false;
    }

    static int count = 0;

    public static void main(String args[]) {
        int n = 4;
        char board[][] = new char[n][n];
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[0].length; j++) {
                board[i][j] = '_';
            }
        }

        nQueens(board, 0);

        // System.err.println(checkNQueens(board, n));
        System.out.println("\nTotal Possible Solutions is : " + count);
    }
}