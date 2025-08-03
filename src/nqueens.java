
public class nqueens {
    public static void main(String[] args) {
        int n=4;
        boolean[][] boards=new boolean[n][n];
        System.out.println(queens(boards,0));


    }

    static int queens(boolean[][] board, int row) {
        if (row == board.length) {
            display(board);
            System.out.println();
            return 1;
        }
        int count = 0;
        for (int col = 0; col < board.length; col++) {
            if (issafe(board, row, col)) {
                board[row][col] = true;
                count += queens(board, row + 1);
                board[row][col] = false;
            }

        }
        return count;
    }

    private static boolean issafe(boolean[][] board, int row, int col) {
        for (int i = 0; i < row; i++) {
            if (board[i][col]) {
                return false;
            }
        }
        int maxleft = Math.min(row, col);
        for (int j = 1; j <= maxleft; j++) {
            if (board[row - j][col - j]) {
                return false;
            }

        }
        int maxright = Math.min(row, board.length - col - 1);
        for (int j = 1; j <= maxright; j++) {
            if (board[row - j][col - j]) {
                return false;
            }

        }
        return true;
    }


    private static void display(boolean[][] board) {
        for (boolean[] row : board) {
            for (boolean element : row) {
                if (element) {
                    System.out.println("Q  ");
                } else {
                    System.out.println("X ");
                }
            }
            System.out.println();
        }
    }
}