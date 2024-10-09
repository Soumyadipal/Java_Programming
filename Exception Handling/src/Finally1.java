import java.util.InputMismatchException;
import java.util.Scanner;

public class Finally1 {
    public static void main(String[] args) {
        int num = 0;
        Scanner sc = new Scanner(System.in);
        try {
            num = sc.nextInt();
        }
        catch (InputMismatchException e){
            System.out.println("Enter a number");
        }
        finally {
            sc.close(); // closing the resource
        }
        System.out.println(num);
    }
}
