import java.util.Scanner;
public class BinaryToDecimal {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Binary Number : ");
        int binarynum = sc.nextInt();
        int ans = 0,power = 1;
        while (binarynum > 0){
            int unit_digit = binarynum % 10;
            ans += (unit_digit * power);
            binarynum /= 10;
            power *= 2;
        }
        System.out.println("The converted decimal number is : "+ans);
    }
}
