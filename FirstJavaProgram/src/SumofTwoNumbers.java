import java.util.Scanner;
public class SumofTwoNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the first Number :");
        int num_1 = sc.nextInt();
        System.out.println("Enter the second Number :");
        int num_2 = sc.nextInt();
        int Sum = num_1 + num_2;
        System.out.println("The Sum is : " + Sum);
    }
}
