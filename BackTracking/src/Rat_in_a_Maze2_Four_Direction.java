// Q) Rat in a Maze-2(4 Direction)
import java.util.*;
public class Rat_in_a_Maze2_Four_Direction {
    public static void pathPrinting(int sr,int sc,int er,int ec,String s,boolean isVisitd[][]){
        if(sr < 0 || sc < 0){
            return;
        }
        if(sr > er || sc > ec){
            return ;
        }
        if(isVisitd[sr][sc] == true){  // very imp
            return;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return ;
        }
        isVisitd[sr][sc] = true;
        // go right
        pathPrinting(sr,sc + 1,er,ec,s + "R",isVisitd);
        // go down
        pathPrinting(sr + 1,sc,er,ec,s + "D",isVisitd);
        // go left
        pathPrinting(sr,sc - 1,er,ec,s + "L",isVisitd);
        // go up
        pathPrinting(sr - 1,sc,er,ec,s + "U",isVisitd);
        isVisitd[sr][sc] = false;  // backtracking
    }
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        boolean isVisited[][] = new boolean[rows][columns];
        System.out.println("Paths are : ");
        pathPrinting(0,0,rows - 1,columns - 1,"",isVisited);
    }
}
