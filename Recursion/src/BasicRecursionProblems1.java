// Q.1) Print all natural numbers 1 to n using Recursion
import java.util.*;
public class BasicRecursionProblems1 {
//    static void isIncreasing(int n) {
//        if (n == 1) {
//            System.out.print(n + " ");
//            return;
//        }
//        isIncreasing(n - 1);
//        System.out.print(n + " ");
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        isIncreasing(n);
//    }
}

// Q.2) Print all natural numbers n to 1 using Recursion
//class PrintNaturalNumbersNTo1 {
//    static void isIncreasing(int n) {
//        if (n == 1) {
//            System.out.print(n + " ");
//            return;
//        }
//        System.out.print(n + " ");
//        isIncreasing(n - 1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        isIncreasing(n);
//    }
//}

// Q.3) Find the value of factorial n
//class FindFactorial {
//    public static int Factorial(int n) {
//        if (n == 0) {
//            return 1;
//        }
//        return (n * Factorial(n - 1));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter n : ");
//        int n = sc.nextInt();
//        int ans = Factorial(n);
//        System.out.println("The factorial of "+n+" is : " + ans);
//    }
//}

// Q.4) Find the nth Fibonacci number
//class FindFibonacci {
//    public static int Fibonacci(int n) {
//        if (n == 0 || n == 1)
//            return n;
//        return (Fibonacci(n - 1) + Fibonacci(n - 2));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the nth number : ");
//        int n = sc.nextInt();
//        int ans = Fibonacci(n);
//        System.out.println("The nth Fibonacci number is : " + ans);
//    }
//}

// Q.5) Given an integer.Find out the sum of its digits using recursion.
//class SumOfDigitsOfaNumber {
//    public static int SumOfDigits(int n) {
//        if (n >= 0 && n <= 9) {
//            return n;
//        }
//         return  ((n % 10) + SumOfDigits(n / 10));
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//        int ans = SumOfDigits(n);
//        System.out.println("The sum of digits is : " + ans);
//    }
//}

// Q.6) Count the number of digits of a number
//class Count{
//    public static int NumberOfDigits(int n) {
//        if (n >=0 && n <= 9) {
//            return 1;
//        }
//        return (NumberOfDigits(n / 10) + 1);
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the number : ");
//        int n = sc.nextInt();
//        int ans = NumberOfDigits(n);
//        System.out.println("The number of digits is : " + ans);
//    }
//}

// Q.7) Given two numbers p and q. Find the value of p^q using recursion
class Power {
    public static int AlternatePow(int p,int q) {
        if (q == 0) {
            return 1;
        }
        int smallPow = pow(p,q / 2);
        if (q % 2 == 0) {
            return smallPow * smallPow;
        }
        return smallPow * smallPow * p;
    }
    public static int pow(int p,int q) {
        if (q == 0) {
            return 1;
        }
        return (p * (pow(p,q - 1)));
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter p : ");
        int p = sc.nextInt();
        System.out.print("Enter q : ");
        int q = sc.nextInt();
        int ans = AlternatePow(p,q);
        //int ans = pow(p,q);
        System.out.println("p^q is : " + ans);
    }
}