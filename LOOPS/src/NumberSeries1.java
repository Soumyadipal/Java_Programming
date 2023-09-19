// Q) Find the Sum of the following Series S = 1-2+3-4+5-6.....n
import java.util.Scanner;
public class NumberSeries1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Number : ");
        int num = sc.nextInt();
        int sum = 0;
        for(int i = 1;i<=num;i++){
            if(i % 2 == 0)
                sum = sum - i;
            else sum = sum + i;
        }
        System.out.println("The Sum is : "+sum);
    }
}
