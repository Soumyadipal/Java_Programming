// Q) Print the Rectangular Pattern
//  ******
//  *    *
//  *    *
//  ******
public class RectangularPattern2 {
    public static void main(String[] args) {
        for (int i = 1; i <= 4; i++) {
            for (int j = 1; j <= 6; j++) {
                if (((i == 2) || (i == 3)) && ((j == 2) || (j == 3) || (j == 4) || (j == 5)))
                    System.out.print(" ");
                else System.out.print("*");
            }
            System.out.println();
        }
    }
}

// Alternative and very easy method
//public class RectangularPattern2 {
//    public static void main(String[] args) {
//        for (int i = 1; i <= 4; i++) {
//            for (int j = 1; j <= 6; j++) {
//                if ((i == 1) || (i == 4) || (j == 1) || (j == 6))
//                    System.out.print("*");
//                else System.out.print(" ");
//            }
//            System.out.println();
//        }
//    }
//}


