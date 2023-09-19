// Q.1) Write a program to display transpose of matrix entered by the user.
// Input : | 1 2 3 |    Output : | 1 4 7 |
//         | 4 5 6 |             | 2 5 8 |
//         | 7 8 9 |             | 3 6 9 |
// Q.2) Given a square matrix,turn it by 90 degrees in a clockwise direction without using any extra space.
// Input : | 1 2 3 |    Output : | 7 4 1 |
//         | 4 5 6 |             | 8 5 2 |
//         | 7 8 9 |             | 9 6 3 |
// Q.3) Given an integer n,returns the first n rows of Pascal's triangle.In Pascal's triangle each number is the sum of the two numbers directly above it.
// And for each row the first and last element always be 1
// Input : 5            Output : 1
//                               1 1
//                               1 2 1
//                               1 3 3 1
//                               1 4 6 4 1
// Q.4) Given an n x m matrix,return all elements of the matrix in spiral order.
// Q.5) Given a positive integer n,generate a n x n matrix,filled with elements from 1 to n^2 in spiral order.
// Input : 3           Output: | 1 2 3 |
//                             | 8 9 4 |
//                             | 7 6 5 |
import java.util.Scanner;
public class SecondDimensionalArrayProblems {
    static int[][] GenerateSpiralMatrix(int n) {
        int[][] Matrix = new int[n][n];
        int topRow = 0;
        int bottomRow = n - 1;
        int leftColumn = 0;
        int rightColumn = n - 1;
        int current = 1;
        while (current <= n * n) {
            // topRow -> leftColumn to rightColumn
            for (int j = leftColumn;j <= rightColumn && current <= n * n;j++) {
                Matrix[topRow][j] = current;
                current++;
            }
            topRow++;
            // rightColumn -> topRow to bottomRow
            for (int i = topRow;i <= bottomRow && current <= n * n;i++) {
                Matrix[i][rightColumn] = current;
                current++;
            }
            rightColumn--;
            // bottomRow -> rightColumn to leftColumn
            for (int j = rightColumn;j >= leftColumn && current <= n * n;j--) {
                Matrix[bottomRow][j] = current;
                current++;
            }
            bottomRow--;
            // leftCOLUMN -> bottomRow to topRow
            for (int i = bottomRow;i >= topRow && current <= n * n;i--) {
                Matrix[i][leftColumn] = current;
                current++;
            }
            leftColumn++;
        }
        return Matrix;
    }
    static void SpiralOrder(int[][] Matrix,int r,int c) {
        int topRow = 0;
        int bottomRow = r - 1;
        int leftColumn = 0;
        int rightColumn = c - 1;
        int totalElements = 0;
        while (totalElements < r * c) {
            // topRow -> leftColumn to rightColumn
            for (int j = leftColumn;j <= rightColumn && totalElements < r * c;j++) {
                System.out.print(Matrix[topRow][j]+" ");
                totalElements++;
            }
            topRow++;
            // rightColumn -> topRow to bottomRow
            for (int i = topRow;i <= bottomRow && totalElements < r * c;i++) {
                System.out.print(Matrix[i][rightColumn]+" ");
                totalElements++;
            }
            rightColumn--;
            // bottomRow -> rightColumn to leftColumn
            for (int j = rightColumn;j >= leftColumn && totalElements < r * c;j--) {
                System.out.print(Matrix[bottomRow][j]+" ");
                totalElements++;
            }
            bottomRow--;
            // leftCOLUMN -> bottomRow to topRow
            for (int i = bottomRow;i >= topRow && totalElements < r * c;i--) {
                System.out.print(Matrix[i][leftColumn]+" ");
                totalElements++;
            }
            leftColumn++;
        }
    }
    static void PascalTriangle(int n) {
        int[][] ans = new int[n][];
        for (int i = 0;i < n;i++) {
            ans[i] = new int[i + 1];
            ans[i][0] = ans[i][i] = 1;
            for (int j = 1;j < i;j++) {
                ans[i][j] = ans[i - 1][j] + ans[i - 1][j - 1];
            }
        }
        PrintMatrix(ans);
    }
    static void ArrayReverse(int[] arr) {
        int i = 0,j = arr.length - 1;
        while (i < j) {
            arr[i] = arr[i] + arr[j];
            arr[j] = arr[i] - arr[j];
            arr[i] = arr[i] - arr[j];
            i++;
            j--;
        }
    }
    static void RotateOfMatrixBy90Degree(int[][] Matrix,int r,int c) {
        FindTransposeMatrixInplace(Matrix,r,c);
        for (int i = 0;i < r;i++) {
            ArrayReverse(Matrix[i]);
        }
    }
    static void FindTransposeMatrixInplace(int[][] Matrix,int r,int c) { // Inplace method is possible only for square matrix
        for (int i = 0;i < r;i++) {
            for (int j = i;j < c;j++) {
                int temp = Matrix[i][j];
                Matrix[i][j] = Matrix[j][i];
                Matrix[j][i] = temp;
            }
        }
    }
    static void FindTransposeMatrixWithExtraMatrix(int[][] Matrix,int r,int c) {
        int[][] ans = new int[c][r];
        for (int i = 0;i < c;i++) {
            for (int j = 0;j < r;j++) {
                ans[i][j] = Matrix[j][i];
            }
        }
        PrintMatrix(ans);
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
//        System.out.print("Enter the number of rows for the Matrix : ");   // Q.1 & Q.2
//        int r = sc.nextInt();                                          // Q.1 & Q.2
//        System.out.print("Enter the number of columns for the Matrix : ");// Q.1 & Q.2
//        int c = sc.nextInt();                                          // Q.1 & Q.2
//        int[][] Matrix = new int[r][c];                              // Q.1 & Q.2
//        System.out.println("Enter the elements of the Matrix : ");        // Q.1 & Q.2
//        for (int i = 0; i < r; i++) {                                    // Q.1 & Q.2
//            for (int j = 0; j < c; j++) {                                // Q.1 & Q.2
//                Matrix[i][j] = sc.nextInt();                           // Q.1 & Q.2
//            }                                                           // Q.1 & Q.2
//        }                                                               // Q.1 & Q.2
//        System.out.println("The input matrix is : ");                   // Q.1 & Q.2
//        PrintMatrix(Matrix);                                            // Q.1 & Q.2
//        System.out.println("The Transpose matrix is : ");            // Q.1
//        FindTransposeMatrixWithExtraMatrix(Matrix,r,c);           // Q.1(With extra matrix)
//        FindTransposeMatrixInplace(Matrix,r,c);                     // Q.1(Inplace)
//        PrintMatrix(Matrix);                                        // Q.1(Inplace)
//        System.out.println("After the rotation of 90 degrees in clockwise direction the matrix will be : ");  // Q.2
//        RotateOfMatrixBy90Degree(Matrix,r,c);                          // Q.2
//        PrintMatrix(Matrix);                                           // Q.2
//        System.out.print("Enter the number : ");                               // Q.3
//        int n = sc.nextInt();                                                  // Q.3
//        System.out.println("The first "+n+" rows of Pascal's Triangle is : "); // Q.3
//        PascalTriangle(n);                                                     // Q.3
//        System.out.print("The Spiral order elements are : ");                   // Q.4
//        SpiralOrder(Matrix,r,c);                                                // Q.4
        System.out.print("Enter an integer n : ");
        int n = sc.nextInt();
        System.out.println("The spiral matrix is : ");
        int[][] SpiralMatrix = GenerateSpiralMatrix(n);
        PrintMatrix(SpiralMatrix);
    }
}