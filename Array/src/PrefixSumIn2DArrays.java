// Q.1) Given a matrix of dimension n x m and 2 coordinates (l1,r1) and (l2,r2).Return the sum of the rectangle from (l1,r1) to (l2,r2).
// Conditions are : 1)l2 >= l1 , r2 >= r1  2) 0 <= l1,l2 < n   3) 0 <= r1,r2 < m
import java.util.Scanner;
public class PrefixSumIn2DArrays {
    static void FindPrefixSumMatrixOverColumnsAndRowsBoth(int[][] Matrix) {
        int r = Matrix.length;
        int c = Matrix[0].length;
        for (int i = 0;i < r;i++) {
            for (int j = 1;j < c;j++) {
                Matrix[i][j] += Matrix[i][j - 1];
            }
        }
        for (int j = 0;j < c;j++) {
            for (int i = 1;i < r;i++) {
                Matrix[i][j] += Matrix[i - 1][j];
            }
        }
    }
    static int RectangleSumUsingPrefixSumOverColumnsAndRowsBoth(int[][] Matrix,int l1,int r1,int l2,int r2) {
        int ans = 0,sum = 0,up = 0,left = 0,upLeft = 0;
        FindPrefixSumMatrixOverColumnsAndRowsBoth(Matrix);
        sum = Matrix[l2][r2];
        if (l1 >= 1) {
            up = Matrix[l1 - 1][r2];
        }
        if (r1 >= 1) {
            left = Matrix[l2][r1 - 1];
        }
        if (l1 >= 1 && r1 >= 1) {
            upLeft = Matrix[l1 - 1][r1 - 1];
        }
        ans = sum - up - left + upLeft;
        return ans;
    }
    static void FindPrefixSumMatrix(int[][] Matrix) {
        int r = Matrix.length;
        int c = Matrix[0].length;
        for (int i = 0;i < r;i++) {
            for (int j = 1;j < c;j++) {
                Matrix[i][j] += Matrix[i][j - 1];
            }
        }
    }
    static int RectangleSumUsingPreCalculatingTheHorizontalSumForEachRowInTheMatrix(int[][] Matrix,int l1,int r1,int l2,int r2) {
        int sum = 0;
        FindPrefixSumMatrix(Matrix);
        for (int i = l1;i <= l2;i++) {
            if (r1 >= 1)
                sum += Matrix[i][r2] - Matrix[i][r1 - 1];
            else sum += Matrix[i][r2];
        }
        return sum;
    }
    static int RectangleSumUsingBruteForce(int[][] Matrix,int l1,int r1,int l2,int r2) {
        int sum = 0;
        for (int i = l1;i <= l2;i++) {
            for (int j = r1;j <= r2;j++) {
                sum += Matrix[i][j];
            }
        }
        return sum;
    }
    static void PrintMatrix(int[][] Matrix) {
        for (int i = 0;i < Matrix.length;i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of rows for the Matrix : ");
        int r = sc.nextInt();
        System.out.print("Enter the number of columns for the Matrix : ");
        int c = sc.nextInt();
        int[][] Matrix = new int[r][c];
        System.out.println("Enter the elements of the Matrix : ");
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                Matrix[i][j] = sc.nextInt();
            }
        }
        System.out.print("Enter l1,r1,l2,r2 : ");
        int l1 = sc.nextInt();
        int r1 = sc.nextInt();
        int l2 = sc.nextInt();
        int r2 = sc.nextInt();
        System.out.println("The input matrix is : ");
        PrintMatrix(Matrix);
        System.out.println("The rectangle sum is : "+RectangleSumUsingBruteForce(Matrix,l1,r1,l2,r2));
//        System.out.println("The rectangle sum is : "+RectangleSumUsingPreCalculatingTheHorizontalSumForEachRowInTheMatrix(Matrix,l1,r1,l2,r2));
        System.out.println("The rectangle sum is : "+RectangleSumUsingPrefixSumOverColumnsAndRowsBoth(Matrix,l1,r1,l2,r2));
    }
}
