// Q) Print the Triangular Pattern
//  *****
//  ****
//  ***
//  **
//  *
public class TriangularPattern2 {
    public static void main(String[] args) {
        for (int i = 5;i >= 1;i--){
            for (int j = 1;j <= i;j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
}
//
//Alternative
//import java.util.Scanner;
//public class TriangularPattern2 {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter number of rows : ");
//        int r = sc.nextInt();
//        for (int i = 1;i <= r;i++){
//            for (int j = 1;j <= (r+1-i);j++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//
//    }
//}
