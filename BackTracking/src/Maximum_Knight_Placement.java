// Q) Find maximum number of Knights that can be placed in a given n * n chessboard
public class Maximum_Knight_Placement {
    static int maxKnights = -1;
    static int number = 8;
    public static boolean isSafe(char[][] grid,int row,int col){
        int n = grid.length;
        int i,j;
        // 2 up 1 right
        i = row - 2;
        j = col + 1;
        if(i >= 0 && j < n && grid[i][j] == 'K') return false;
        // 2 up 1 left
        i = row - 2;
        j = col - 1;
        if(i >= 0 && j >= 0 && grid[i][j] == 'K') return false;
        // 2 down 1 right
        i = row + 2;
        j = col + 1;
        if(i < n && j < n && grid[i][j] == 'K') return false;
        // 2 down 1 left
        i = row + 2;
        j = col - 1;
        if(i < n && j >= 0 && grid[i][j] == 'K') return false;
        // 2 right 1 up
        i = row - 1;
        j = col + 2;
        if(i >= 0 && j < n && grid[i][j] == 'K') return false;
        // 2 right 1 down
        i = row + 1;
        j = col + 2;
        if(i < n && j < n && grid[i][j] == 'K') return false;
        // 2 left 1 up
        i = row - 1;
        j = col - 2;
        if(i >= 0 && j >= 0 && grid[i][j] == 'K') return false;
        // 2 left 1 down
        i = row + 1;
        j = col - 2;
        if(i < n && j >= 0 && grid[i][j] == 'K') return false;

        return true;
    }
    public static void maxKnight(char [][] chessBoard,int row,int col,int num){
        int n = chessBoard.length;
        if(row == n){ // base case
            if(num == number){
                for(int i = 0;i < n;i++){
                    for(int j = 0;j < n;j++){
                        System.out.print(chessBoard[i][j]);
                    }
                    System.out.println();
                }
                System.out.println();
            }
            maxKnights = Math.max(maxKnights,num);
            return;
        } else if (isSafe(chessBoard,row,col)) {
            chessBoard[row][col] = 'K';
            if(col != n - 1) maxKnight(chessBoard,row,col + 1,num + 1);
            else maxKnight(chessBoard,row + 1,0,num + 1);
            chessBoard[row][col] = 'X';
        }
        if(col != n - 1) maxKnight(chessBoard,row,col + 1,num);
        else maxKnight(chessBoard,row + 1,0,num);
    }
    public static void main(String[] args) {
        int n = 4;
        char [][] chessBoard = new char[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                chessBoard[i][j] = 'X';
            }
        }
        maxKnight(chessBoard,0,0,0);
        System.out.println("Maximum number of Knights : " + maxKnights);
    }
}
