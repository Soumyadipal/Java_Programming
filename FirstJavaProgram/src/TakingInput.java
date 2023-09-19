import java.util.Scanner;
public class TakingInput {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your Name:");
        String name=sc.nextLine();
        System.out.println("My Name is : " + name);
        System.out.println("Enter your lucky Number :");
        int num_1=sc.nextInt();
        System.out.println("Lucky Number is :" + num_1);
    }
}
