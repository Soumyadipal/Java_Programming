import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally2 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
        }
        // Using finally without catch
        finally {
            sc.close(); // closing the resource
            System.out.println("Resource closed");
        }
        System.out.println(num);
    }
}
