import java.util.Scanner;
class Algebra {
    int sum(int a,int b) {
        int Ans = a + b;
        return Ans;
    }
}
public class AddTwoNumbersUsingMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the First Number : ");
        int x = sc.nextInt();
        System.out.print("Enter the Second Number : ");
        int y = sc.nextInt();
        Algebra Obj = new Algebra();
        int Ans = Obj.sum(x,y);
        System.out.println("The sum of "+x+" and "+y+" is : "+Ans);
    }
}
