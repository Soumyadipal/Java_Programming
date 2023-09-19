import java.util.Scanner;
public class EvenAndDivisibleBy3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        if(num % 2 == 0){
            if(num % 3 == 0)
                System.out.println("The Number is Even and Divisible by 3");
            else System.out.println("The Number is Even but not Divisible by 3");
        }
             else System.out.println("The Number is Odd");

    }
}
