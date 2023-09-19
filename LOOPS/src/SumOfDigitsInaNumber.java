import java.util.Scanner;
public class SumOfDigitsInaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int operational_num = num,SumOfDigits = 0;
        while (operational_num > 0){
            SumOfDigits+= operational_num % 10;
            operational_num = operational_num / 10;
        }
        System.out.println("Sum of Digits of "+num+" is : "+SumOfDigits);
    }
}

