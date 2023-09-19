import java.util.Scanner;
public class ReverseDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int operational_num = num,Ans = 0;
        while (operational_num > 0){
            Ans = (Ans * 10) + operational_num % 10;
            operational_num = operational_num / 10;
        }
        System.out.println("Reverse Digits of "+num+" is : "+Ans);
    }
}
