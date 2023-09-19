public class LogicalOperators {
    public static void main(String[] args) {
        int p = 10, q = 8, r = 5;
        // && Operator
        System.out.println((p==q) && (p==r));
        System.out.println((p>q) && (p>r));
        System.out.println((p>q) && (p<r));

        // || Operator
        System.out.println((p==q) || (p==r));
        System.out.println((p>q) || (p>r));
        System.out.println((p>q) || (p<r));

        // ! Operator
        System.out.println(!((p==q) && (p==r)));
        System.out.println(!((p>q) && (p>r)));
        System.out.println(!((p>q) && (p<r)));
    }
}
