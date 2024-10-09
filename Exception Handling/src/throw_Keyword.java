import java.util.Scanner;

public class throw_Keyword {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 6;
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        try {
            if(num2 < 0){
                Exception e = new ArithmeticException("Negative number");
                throw e;
            }
            else {
                int result = num1 / num2;
                System.out.println(result);
            }
        }
        catch (Exception e){
            System.out.println("Enter a valid number " + e);
        }
    }
}
