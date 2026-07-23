package Day28;
import java.util.*;


public class Prob2 {
    static List<List<String>> result = new ArrayList<>();

    public static List<List<String>> solveNQueens(int n) {
        char[][] board = new char[n][n];

        // Fill board with '.'
        for (int i = 0; i < n; i++) {
            Arrays.fill(board[i], '.');
        }

        solve(board, 0, n);
        return result;
    }

    static void solve(char[][] board, int row, int n) {

        if (row == n) {
            result.add(construct(board));
            return;
        }

        for (int col = 0; col < n; col++) {

            if (isSafe(board, row, col, n)) {

                board[row][col] = 'Q';

                solve(board, row + 1, n);

                // Backtrack
                board[row][col] = '.';
            }
        }
    }

    static boolean isSafe(char[][] board, int row, int col, int n) {

        
        for (int i = 0; i < row; i++) {
            if (board[i][col] == 'Q')
                return false;
        }

        
        for (int i = row - 1, j = col - 1; i >= 0 && j >= 0; i--, j--) {
            if (board[i][j] == 'Q')
                return false;
        }

        
        for (int i = row - 1, j = col + 1; i >= 0 && j < n; i--, j++) {
            if (board[i][j] == 'Q')
                return false;
        }

        return true;
    }

    static List<String> construct(char[][] board) {

        List<String> temp = new ArrayList<>();

        for (char[] row : board) {
            temp.add(new String(row));
        }

        return temp;
    }

    public static void main(String[] args) {

        int n = 4;

        List<List<String>> ans = solveNQueens(n);

        System.out.println("Solutions:");

        for (List<String> solution : ans) {
            for (String row : solution) {
                System.out.println(row);
            }
            System.out.println();
        }
    }
    
}
