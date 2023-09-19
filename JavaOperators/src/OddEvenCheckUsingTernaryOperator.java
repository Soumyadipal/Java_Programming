import java.util.Scanner;
public class OddEvenCheckUsingTernaryOperator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number : ");
        int num = sc.nextInt();
        String ans;
        ans = (num % 2 == 0) ? "The Number is Even" : "The Number is Odd";
        System.out.println(ans);

    }
}
