
import java.util.Scanner;
public class SimpleInterest {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the Principle : ");
        float P = sc.nextFloat();
        System.out.println("Enter the rate of Interest : ");
        float r = sc.nextFloat();
        System.out.println("Enter the time : ");
        float t = sc.nextFloat();
        float SI = (P * r * t)/100;
        System.out.println("The Simple Interest is : " + SI);
    }
}
