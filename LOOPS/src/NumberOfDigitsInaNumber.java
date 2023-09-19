import java.util.Scanner;
public class NumberOfDigitsInaNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number: ");
        int num = sc.nextInt();
        int operational_num = num,NumberOfDigits = 0;
        while (operational_num > 0){
            operational_num = operational_num / 10;
            NumberOfDigits++;
        }
        System.out.println("Number of Digits in "+num+" is : "+NumberOfDigits);
    }
}
