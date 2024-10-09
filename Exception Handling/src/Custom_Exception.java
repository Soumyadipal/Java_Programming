import java.util.Scanner;

class MyException extends Exception {
    public MyException(){}
    public MyException(String msg){
        super(msg);
    }
}
public class Custom_Exception {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int num1 = 6;
        System.out.print("Enter num2 : ");
        int num2 = sc.nextInt();
        try {
            if(num2 < 0){
                Exception e = new MyException("Negative Number");
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
