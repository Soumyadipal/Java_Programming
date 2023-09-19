// Q)Print the Rectangular pattern
//  121212
//  212121
//  121212
//  212121

//import java.util.Scanner;
//public class RectangularPattern4 {
//        public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.print("Enter number of rows : ");
//            int r = sc.nextInt();
//            System.out.print("Enter number of columns : ");
//            int c = sc.nextInt();
//            for (int i = 1;i <= r;i++){
//                for (int j = 1;j <= c;j++){
//                    if(i % 2 != 0){
//                        if(j % 2 != 0)
//                            System.out.print("1");
//                        else System.out.print("2");
//                    }
//                    else {
//                        if(j % 2 != 0)
//                            System.out.print("2");
//                        else System.out.print("1");
//
//                    }
//                }
//                System.out.println();
//            }
//        }
//}
//
//Alternative easy method

        import java.util.Scanner;
public class RectangularPattern4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter number of rows : ");
        int r = sc.nextInt();
        System.out.print("Enter number of columns : ");
        int c = sc.nextInt();
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= c; j++) {
                if ((i + j) % 2 == 0)
                    System.out.print(1);
                else System.out.print(2);
            }
            System.out.println();
        }
    }
}