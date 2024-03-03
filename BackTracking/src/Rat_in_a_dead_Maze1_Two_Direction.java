// Q) Rat in a Maze – A maze is an N*N binary matrix of blocks where the upper left block is known as the Source
// block, and the lower rightmost block is known as the Destination block. If we consider the maze, then maze[0][0]
// is the source, and maze[N-1][N-1] is the destination. Our main task is to reach the destination from the
// source. We have considered a rat as a character that can move either forward or downwards.
// In the maze matrix, a few dead blocks will be denoted by 0 and active blocks will be denoted by 1. A rat can
// move only in the active blocks.
public class Rat_in_a_dead_Maze1_Two_Direction {
    public static void pathPrinting(int sr,int sc,int er,int ec,String s,int [][] maze){
        if(sr > er || sc > ec){
            return ;
        }
        if(maze[sr][sc] == 0){
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return ;
        }
        // go right
        pathPrinting(sr,sc + 1,er,ec,s + "R",maze);
        // go down
        pathPrinting(sr + 1,sc,er,ec,s + "D",maze);
    }
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int [][] maze = {{1,0,1},
                         {1,1,1},
                         {0,1,1}};
        System.out.println("Paths are : ");
        pathPrinting(0,0,rows - 1,columns - 1,"",maze);
    }
}
