// Q) Consider an N*N chessboard. N Queen Problem is to accommodate N queens on the N*N chessboard such that
// no 2 queens can attack each other.
public class N_Queens {
    public static boolean isSafe(char [][] chessBoard,int row,int col){
        int n = chessBoard.length;
        // check row
        for(int j = 0;j < n;j++){
            if(chessBoard[row][j] == 'Q')
                return false;
        }
        // check column
        for (int i = 0;i < n;i++){
            if(chessBoard[i][col] == 'Q')
                return false;
        }
        // check North-East
        int i = row;
        int j = col;
        while (i >= 0 && j < n){
            if (chessBoard[i][j] == 'Q')
                return false;
            i--;
            j++;
        }
        // check South-West
        i = row;
        j = col;
        while (i < n && j >= 0){
            if (chessBoard[i][j] == 'Q')
                return false;
            i++;
            j--;
        }
        // check North-West
        i = row;
        j = col;
        while (i >= 0 && j >= 0){
            if (chessBoard[i][j] == 'Q')
                return false;
            i--;
            j--;
        }
        // check South-East
        i = row;
        j = col;
        while (i < n && j < n){
            if (chessBoard[i][j] == 'Q')
                return false;
            i++;
            j++;
        }
        return true;
    }
    public static void nqueens(char [][] chessBoard,int row){
        int n = chessBoard.length;
        if(row == n){
            for(int i = 0;i < n;i++){
                for(int j = 0;j < n;j++){
                    System.out.print(chessBoard[i][j]);;
                }
                System.out.println();
            }
            System.out.println();
            return;
        }
        for(int j = 0;j < n;j++){  // work and call
            if(isSafe(chessBoard,row,j)){
                chessBoard[row][j] = 'Q';
                nqueens(chessBoard,row + 1);
                chessBoard[row][j] = 'X';  // backtracking
            }
        }
    }
    public static void main(String[] args) {
        int n = 4;
        char [][] chessBoard = new char[n][n];
        for(int i = 0;i < n;i++){
            for(int j = 0;j < n;j++){
                chessBoard[i][j] = 'X';
            }
        }
        nqueens(chessBoard,0);
    }
}
