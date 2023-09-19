import java.util.Scanner;
public class SumOfnNaturalNumbersUsingWhileLoop {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number : ");
        int n = sc.nextInt();
        int num = 1, sum = 0;
        while(num <= n){
            sum = sum + num;
            num++;
        }
        System.out.println("The Sum of "+n+" Natural Numbers is : "+sum);
    }
}
