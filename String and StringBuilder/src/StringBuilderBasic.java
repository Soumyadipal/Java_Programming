import java.util.*;
public class StringBuilderBasic {
    public static void main(String[] args) {
        StringBuilder str = new StringBuilder("hello");
        System.out.println(str);
        str.setCharAt(0,'m');
        System.out.println(str);
        str.append(" world");
        System.out.println(str);
    }
}
