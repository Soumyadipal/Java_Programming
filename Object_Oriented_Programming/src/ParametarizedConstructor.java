class algebra {
    int a,b;
    algebra(int x,int y) {
        System.out.println("Constructor is called");
        a = x;
        b = y;
    }
    int Add() {
        return (a + b);
    }
    int Sub() {
        return (a - b);
    }
    int Mul() {
        return (a * b);
    }
}
public class ParametarizedConstructor {
    public static void main(String[] args) {
        algebra obj1 = new algebra(4,8);
        System.out.println("The summation is : "+obj1.Add());
        System.out.println("The subtraction is : "+obj1.Sub());
        System.out.println("The multiplication is : "+obj1.Mul());

        algebra obj2 = new algebra(8,5);
        System.out.println("The summation is : "+obj2.Add());
        System.out.println("The subtraction is : "+obj2.Sub());
        System.out.println("The multiplication is : "+obj2.Mul());
    }
}
