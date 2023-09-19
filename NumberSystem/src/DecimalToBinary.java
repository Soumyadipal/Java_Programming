import java.util.Scanner;
public class DecimalToBinary {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Decimal Number : ");
        int decimalnum = sc.nextInt();
        int ans = 0,power = 1;
        while (decimalnum > 0){
            int parity = decimalnum % 2;
            ans += (parity * power);
            decimalnum /= 2;
            power *= 10;
        }
        System.out.println("The converted Binary Number is : "+ans);
    }
}
