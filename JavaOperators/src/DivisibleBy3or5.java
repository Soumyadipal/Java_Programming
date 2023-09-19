import java.util.Scanner;
public class DivisibleBy3or5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if(num % 3 == 0 && num % 5 ==0)
            System.out.println("The Number is Divisible by both 3 and 5");
         else if (num % 3 == 0 || num % 5 ==0) {
            if(num % 3 == 0)
                System.out.println("The Number is Divisible by only 3");
            else System.out.println("The Number is Diviseble by only 5 ");
        }
        else System.out.println("The Number is not Divisible by both 3 and 5");
    }
}
