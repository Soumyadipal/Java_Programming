// Q.1) Find addition of two matrix.
// Q.2) Write a program to display multiplication of two matrices entered by the user.
// Q.3) Reverse each row of a matrix.
import java.util.Scanner;
class secondDimentional {
    void demoArray() {
        int [][] Array2 = new int[4][3];
        int [][] array2 = {{45,209,264},{77,210,7},{18,183,101},{8,5,88}};
        Array2[0][0] = 48;
        Array2[0][1] = 10;
        Array2[0][2] = 12;
        System.out.println(Array2[0][0]);
        System.out.println(array2[0][0]);
        System.out.println(array2[0][1]);
        System.out.println(array2[0][2]);

    }
}
class thirddimen {
    void demoArray() {
        int [][][] Array3 = new int[4][3][2];
        Array3[0][1][1] = 88;
        System.out.println(Array3[0][1][1]);
    }
}
public class MultiDimensionalArrayBasic {
    static void RowReverseForMatrix(int[][] Matrix) {
        for (int i = 0;i < Matrix.length;i++) {
            int s = 0;
            int e = Matrix[i].length - 1;
            while (s < e) {
                Matrix[i][s] = Matrix[i][s] + Matrix[i][e];
                Matrix[i][e] = Matrix[i][s] - Matrix[i][e];
                Matrix[i][s] = Matrix[i][s] - Matrix[i][e];
                s++;
                e--;
            }
        }
        System.out.println("The resultant matrix is : ");
        PrintMatrix(Matrix);
    }
    static void MultiplicationOfTwoMatrix(int[][] Matrix1,int r1,int c1,int[][] Matrix2,int r2,int c2) {
        if (c1 != r2) {
            System.out.println("Multiplication is not possible : Wrong dimension");
            return;
        }
        int[][] Mul = new int[r1][c2];
        for (int i = 0;i < r1;i++) {
            for (int j = 0;j < c2;j++) {
                for (int k = 0;k < c1;k++) {
                    Mul[i][j] += (Matrix1[i][k] * Matrix2[k][j]);
                }
            }
        }
        PrintMatrix(Mul);
    }
    static void PrintMatrix(int[][] Matrix) {
        for (int i = 0;i < Matrix.length;i++) {
            for (int j = 0; j < Matrix[i].length; j++) {
                System.out.print(Matrix[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void SumOfTwoMatrix(int[][] Matrix1,int r1,int c1,int[][] Matrix2,int r2,int c2) {
        if (r1 != r2 || c1 != c2) {
            System.out.println("Wrong Input : Addition is not possible.");
            return;
        }
        int[][] Sum = new int[r1][c1];
        for (int i = 0;i < r1;i++) {
            for (int j = 0;j < c1;j++) {
                Sum[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }
        PrintMatrix(Sum);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number of rows for Matrix 1 : ");   // Q.1 & Q.2
//        int r1 = sc.nextInt();                                          // Q.1 & Q.2
//        System.out.print("Enter the number of columns for Matrix 1 : ");// Q.1 & Q.2
//        int c1 = sc.nextInt();                                          // Q.1 & Q.2
//        int[][] Matrix1 = new int[r1][c1];                              // Q.1 & Q.2
//        System.out.println("Enter the elements of Matrix 1 : ");        // Q.1 & Q.2
//        for (int i = 0;i < r1;i++) {                                    // Q.1 & Q.2
//            for (int j = 0;j < c1;j++) {                                // Q.1 & Q.2
//                Matrix1[i][j] = sc.nextInt();                           // Q.1 & Q.2
//            }                                                           // Q.1 & Q.2
//        }                                                               // Q.1 & Q.2
//        System.out.print("Enter the number of rows for Matrix 2 : ");   // Q.1 & Q.2
//        int r2 = sc.nextInt();                                          // Q.1 & Q.2
//        System.out.print("Enter the number of columns for Matrix 2 : ");// Q.1 & Q.2
//        int c2 = sc.nextInt();                                          // Q.1 & Q.2
//        int[][] Matrix2 = new int[r2][c2];                              // Q.1 & Q.2
//        System.out.println("Enter the elements of Matrix 2 : ");        // Q.1 & Q.2
//        for (int i = 0;i < r2;i++) {                                    // Q.1 & Q.2
//            for (int j = 0;j < c2;j++) {                                // Q.1 & Q.2
//                Matrix2[i][j] = sc.nextInt();                           // Q.1 & Q.2
//            }                                                           // Q.1 & Q.2
//        }                                                               // Q.1 & Q.2
//        System.out.println("The addition of Matrix 1 and Matrix 2 is : ");   // Q.1
//        SumOfTwoMatrix(Matrix1,r1,c1,Matrix2,r2,c2);                         // Q.1
//        System.out.println("The Multiplication of two matrices is : ");        // Q.2
//        MultiplicationOfTwoMatrix(Matrix1,r1,c1,Matrix2,r2,c2);                // Q.2
        System.out.print("Enter the number of rows for the Matrix : ");   // Q.3
        int r = sc.nextInt();                                          // Q.3
        System.out.print("Enter the number of columns for the Matrix : ");// Q.3
        int c = sc.nextInt();                                          // Q.3
        int[][] Matrix = new int[r][c];                              // Q.3
        System.out.println("Enter the elements of the Matrix : ");        // Q.3
        for (int i = 0;i < r;i++) {                                    // Q.3
            for (int j = 0;j < c;j++) {                                // Q.3
                Matrix[i][j] = sc.nextInt();                           // Q.3
            }                                                           // Q.3
        }                                                               // Q.3
        RowReverseForMatrix(Matrix);                                    // Q.3
//        secondDimentional obj1 = new secondDimentional();
//        obj1.demoArray();
//        thirddimen obj2 = new thirddimen();
//        obj2.demoArray();
    }
}
