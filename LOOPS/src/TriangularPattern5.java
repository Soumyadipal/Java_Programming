// Q) Print the Triangular pattern
//     1
//    2 2
//   3   3
//  4444444

import java.util.Scanner;
public class TriangularPattern5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        for (int i = 1;i <= r - 1;i++){
            for (int j = 1;j <= r - i;j++){
                System.out.print(" ");
            }
            System.out.print(i);
            for (int k = 1;k <= 2 * i -3;k++){
                System.out.print(" ");
            }
           if (i > 1)
               System.out.print(i);
            System.out.println();
        }
        for (int l = 1; l <= 2 * r -1;l++)
            System.out.print(r);
    }

}

//Alternative easy method(this pattern is possible only for row value 4 in this method)

//        import java.util.Scanner;
//public class TriangularPattern5 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of rows : ");
//        int r = sc.nextInt();
//        for (int i = 1; i <= r; i++) {
//            for (int j = 1; j <= 2 * r - 1; j++) {
//                if ((i == r) || (i + j == 5) || (j - i == 3))
//                    System.out.print(i);
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}
