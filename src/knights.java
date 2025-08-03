public class knights {
    public static void main(String[] args) {
        int n=4;
        boolean[][] board=new boolean[n][n];
        knighr(board,0,0,4);
    }
    static void knighr(boolean[][] board,int row,int col,int knight){
        if (knight==0){
            display(board);
            System.out.println();
            return;
        }
        if (row== board.length-1 && col== board.length){
            return;
        }
        if (col== board.length){
            knighr(board,row+1,0,knight);
            return;
        }
        if (isSafe(board,row,col)){
            board[row][col]=true;
            knighr(board,row,col+1,knight-1);
            board[row][col]=false;

        }
        knighr(board,row,col+1,knight);
    }

    private static boolean isSafe(boolean[][] board, int row, int col) {
        if (isvalid(board,row-2,col-1)){
            if(board[row-2][col-1]){
                return false;
            }
        }
        if (isvalid(board,row-1,col-2)){
            if(board[row-1][col-2]){
                return false;
            }
        }
        if (isvalid(board,row-2,col+1)){
            if(board[row][col]){
                return false;
            }
        }
        if (isvalid(board,row-1,col+2)){
            if(board[row][col]){
                return false;
            }
        }
        return true;


    }
    static boolean isvalid(boolean[][] board, int row, int col){
        if (row>=0 && row< board.length && col>=0 && col< board.length){
            return true;
        }
        return false;
    }

    private static void display(boolean[][] board){
        for(boolean[] row:board){
            for (boolean element:row){
                if (element){
                    System.out.println("K ");
                }
                else {
                    System.out.println("X ");
                }
            }
            //System.out.println();
        }
    }

}
