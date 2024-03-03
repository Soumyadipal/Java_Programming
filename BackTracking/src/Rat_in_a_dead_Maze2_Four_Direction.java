// Q) Rat in a Maze – A maze is an N*N binary matrix of blocks where the upper left block is known as the Source
// block, and the lower rightmost block is known as the Destination block. If we consider the maze, then maze[0][0]
// is the source, and maze[N-1][N-1] is the destination. Our main task is to reach the destination from the
// source. We have considered a rat as a character that can move either forward or downwards or backward or upward.
// In the maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1. A rat can
// move only in the active blocks.

//Approach – Create a recursive function that will follow a path, and if that path fails, then Backtrack and try
//        another path. Let us see each step
//        * Create an output matrix having all values as 0
//        * Create a recursive function which will take input matrix, output matrix, and rat position (i,j)
//        * If the position is not valid, then return
//        * Make output[i][j] as one and verify if the current position is the destination or not. If yes, return the output matrix
//        * Recursively call the function for position (i+1, j) and (i,j+1)
//        * Make output[i]j] as 0.

//Time Complexity –
//        If there are N rows and N columns, then complexity will be O(2^(N^2).
//        There are N^2 total cells, and for each cell, we have 2 options (right direction and down direction). Hence,
//        complexity is 2^(N^2).
//Space Complexity –
//        If there are N rows and N columns, then complexity will be O(N^2).
public class Rat_in_a_dead_Maze2_Four_Direction {
    public static void pathPrinting(int sr,int sc,int er,int ec,String s,int [][] maze){
        if(sr < 0 || sc < 0){
            return;
        }
        if(sr > er || sc > ec){
            return ;
        }
        if(maze[sr][sc] == 0){
            return;
        }
        if(maze[sr][sc] == -1){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return ;
        }
        maze[sr][sc] = -1;
        // go right
        pathPrinting(sr,sc + 1,er,ec,s + "R",maze);
        // go down
        pathPrinting(sr + 1,sc,er,ec,s + "D",maze);
        // go left
        pathPrinting(sr,sc - 1,er,ec,s + "L",maze);
        // go up
        pathPrinting(sr - 1,sc,er,ec,s + "U",maze);

        maze[sr][sc] = 1;  // backtracking
    }
    public static void main(String[] args) {
        int rows = 3;
        int columns = 4;
        int [][] maze = {{1,0,1,1},
                         {1,1,1,1},
                         {1,1,0,1}};
        System.out.println("Paths are : ");
        pathPrinting(0,0,rows - 1,columns - 1,"",maze);
    }
}
