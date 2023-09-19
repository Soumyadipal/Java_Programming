// Q)Print the Rectangular pattern
//  1234567
//  2345671
//  3456712
//  4567123
//  5671234
//  6712345
//  7123456
import java.util.Scanner;
public class RectangularPattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        for (int i = 1;i <= r;i++){
            for (int j = i;j <= c;j++){
                System.out.print(j);
            }
            for (int k = 1;k <= i-1;k++){
                System.out.print(k);
            }
            System.out.println();
        }
    }
}
