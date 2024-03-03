// Q) Rat in a Maze-1(Two Direction)
import java.util.*;
public class Rat_in_a_Maze1_Two_Direction {
    public static void pathPrinting(int sr,int sc,int er,int ec,String s){
        if(sr > er || sc > ec){
            return ;
        }
        if(sr == er && sc == ec){
            System.out.println(s);
            return ;
        }
        // go right
        pathPrinting(sr,sc + 1,er,ec,s + "R");
        // go down
        pathPrinting(sr + 1,sc,er,ec,s + "D");
    }
    public static int maze(int sr,int sc,int er,int ec){
        if(sr > er || sc > ec){
            return 0;
        }
        if(sr == er && sc == ec){
            return 1;
        }
        int downWays = maze(sr + 1,sc,er,ec);
        int rightWays = maze(sr,sc + 1,er,ec);
        int totalWays = downWays + rightWays;
        return totalWays;
    }
    public static void main(String[] args) {
        int rows = 3;
        int columns = 3;
        int count = maze(1,1,rows,columns);
        System.out.println("Numbr of ways : " + count);
        System.out.println("Paths are : ");
        pathPrinting(1,1,rows,columns,"");
    }
}
