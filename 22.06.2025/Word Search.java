import java.util.Scanner;
public class WordSearch {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int rows = input.nextInt();
        int cols = input.nextInt();
        char[][] board = new char[rows][cols];
        for (int i = 0; i < rows; i++) {
            String line = input.next();
            for (int j = 0; j < cols; j++) {
                board[i][j] = line.charAt(j);
            }
        }
        String word = input.next();
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                if (dfs(board, i, j, word, 0)) {
                    System.out.println(true);
                    return;
                }
            }
        }
        System.out.println(false);
        input.close();
    }
    static boolean dfs(char[][] board, int row, int col, String word, int index) {
        if (index == word.length()) return true;
        if (row < 0 || row >= board.length || col < 0 || col >= board[0].length || board[row][col] != word.charAt(index)) {
            return false;
        }
        char temp = board[row][col];
        board[row][col] = '#';
        boolean found = dfs(board, row - 1, col, word, index + 1) ||
                        dfs(board, row + 1, col, word, index + 1) ||
                        dfs(board, row, col - 1, word, index + 1) ||
                        dfs(board, row, col + 1, word, index + 1);
        board[row][col] = temp;
        return found;
    }
}
