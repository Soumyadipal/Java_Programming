import java.util.Scanner;

public class Try_With_Resource {
    public static void main(String[] args) {
        int num = 0;

        // try with resource
        try(Scanner sc = new Scanner(System.in)) {
            num = sc.nextInt();
        }
        System.out.println(num);
    }
}
