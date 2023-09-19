import java.util.*;
public class StringBasic1 {
    public static void main(String[] args) {
        String str = "Soumyadip";
        System.out.println(str.length()); // 9
        char ch = str.charAt(8);
        System.out.println(ch); // p
        System.out.println(str.indexOf('S')); // 0
        String gtr1 = "Soumyadip";
        System.out.println(str.compareTo(gtr1)); // 0
        String gtr2 = "Doumyadip";
        System.out.println(str.compareTo(gtr2)); // 15
        String gtr3 = "Xoumyadip";
        System.out.println(str.compareTo(gtr3)); // -5
        System.out.println(str.contains("mya")); // true
        System.out.println(str.contains("pal")); // false
        System.out.println(str.startsWith("Soumya")); // true
        System.out.println(str.startsWith("dip")); // false
        System.out.println(str.endsWith("ip")); // true
        System.out.println(str.endsWith("mya")); // false
        System.out.println(str.toLowerCase()); // soumyadip pal
        System.out.println(str.toUpperCase()); // SOUMYADIP PAL
        System.out.println(gtr2.concat(gtr3)); // DoumyadipXoumyadip

        String str1 = "abc";
        str1 += "xyz";
        System.out.println(str1); // abcxyz
        str1 += 's';
        System.out.println(str1); // abcxyzs
        str1 += 8;
        System.out.println(str1); // abcxyzs8
    }
}
