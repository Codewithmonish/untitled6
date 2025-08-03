public class maze2 {
    public static void main(String[] args) {
        boolean[][] board={
                {true,true,true},
                {true,true,true},
                {true,true,true}
        };
        int[][] path=new int[board.length][board[0].length];
        allpath("",board,0,0,path,1);

    }
    static void allpath(String p,boolean[][] maze,int r,int c,int[][] path,int step){
        if (r==maze.length-1 && c==maze.length-1){
            for (int[] arr:path){
                System.out.println(arr);

            }
            System.out.println();
            return;
        }
        if (maze[r][c]==false){
            return;
        }
        maze[r][c]=false;
        path[r][c]=step;
        if (r<maze.length-1){
            allpath(p+'D',maze,r+1,c,path,step+1);
        }
        if (c<maze.length-1){
            allpath(p+'R',maze,r,c+1,path,step+1);
        }
        if (r>0){
            allpath(p+"U",maze,r-1,c,path,step+1);
        }
        if (c>0){
            allpath(p+"L",maze,r,c-1,path,step+1);
        }
        maze[r][c]=true;
        path[r][c]=0;
    }

}
