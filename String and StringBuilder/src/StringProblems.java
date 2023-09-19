// Q.1) Given a string s, print all the substrings of s.
// Input : "abcd"
// Output : a ab abc abcd b bc bcd c cd d
import java.util.*;
public class StringProblems {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the string : ");
//        String str = sc.nextLine();
//        System.out.print("All substring of "+str+" is : ");
//        for (int i = 0;i < str.length();i++) {
//            for (int j = i + 1;j <= str.length();j++) {
//                System.out.print(str.substring(i,j)+" ");
//            }
//        }
//
//    }

}

// Q.2) Given a string, the task is to toggle all the characters of the string i.e to convert Upper case to Lower case using StringBuilder and vice versa
// Input : PhysICS
// Output : pHYSics
// import java.util.*;
//class toggle {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string :");
//        StringBuilder str = new StringBuilder(sc.nextLine());
//        for (int i = 0;i < str.length();i++) {
//            boolean flag = true;
//            char ch = str.charAt(i);
//            if (ch == ' ') {
//                continue;
//            }
//            int asci = (int)ch;
//            if (asci >= 97) {  // small
//                flag = false;
//            }
//            if (flag == true) { // capital
//                asci += 32;
//                char dh = (char)asci;
//                str.setCharAt(i,dh);
//            }
//            else {
//                asci -= 32;
//                char dh = (char)asci;
//                str.setCharAt(i,dh);
//            }
//        }
//        System.out.println(str);
//    }
//}

// Q.3) Given a string, the task is to toggle all the characters of the string i.e to convert Upper case to Lower case using String and vice versa
// Input : PhysICS
// Output : pHYSics
//class toggle_notUsing_String_Builder {
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.println("Enter the string :");
//        String str = sc.nextLine();
//        for (int i = 0;i < str.length();i++) {
//            boolean flag = true;
//            char ch = str.charAt(i);
//            if (ch == ' ') {
//                continue;
//            }
//            int asci = (int)ch;
//            if (asci >= 97) {  // small
//                flag = false;
//            }
//            if (flag == true) { // capital
//                asci += 32;
//                char dh = (char)asci;
//                str = str.substring(0,i) + dh +str.substring(i + 1);
//            }
//            else {
//                asci -= 32;
//                char dh = (char)asci;
//                str = str.substring(0,i) + dh +str.substring(i + 1);
//            }
//        }
//        System.out.println(str);
//    }
//}

// Q.4) Given a string s, return the number of palindromic substrings in it.
// Input : abc
// Output : 3
//class NumberOfPalindromicSubstring {
//    public static boolean isPalindromic(String str) {
//        int i = 0, j = str.length() - 1;
//        while (i < j) {
//            if (str.charAt(i) != str.charAt(j)) {
//                return false;
//            }
//            i++;
//            j--;
//        }
//        return true;
//    }
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        System.out.print("Enter the String : ");
//        String str = sc.nextLine();
//        int count = 0;
//        for (int i = 0;i < str.length();i++) {
//            for (int j = i + 1;j <=str.length();j++) {
//                if(isPalindromic(str.substring(i,j)) == true ) {
//                    System.out.print(str.substring(i,j)+" ");
//                    count++;
//                }
//            }
//        }
//        System.out.println("The number of Palindromic Substrings are : "+ count);
//    }
//}

// Q.5) Write a java program to reverse each word in a string
// Input : I am an educator
// Output : I ma na rotacude
//class ReverseWordInSentence {
//    public static void main(String[] args) {
//        String str = "I am an educator";
//        String ans = "";
//        StringBuilder sb = new StringBuilder("");
//        for(int i = 0;i < str.length();i++) {
//            char ch = str.charAt(i);
//            if (ch != ' ') {
//                sb.append(ch);
//            }
//            else {
//                sb.reverse();
//                ans += sb;
//                ans += " ";
//                sb = new StringBuilder("");
//            }
//        }
//        sb.reverse();
//        ans += sb;
//        System.out.println(ans);
//
//    }
//}

// Q.6) The string should be compressed such that consecutive duplicates of characters are replaced with the character and followed by the number of consecutive duplicates.
// Input : aaabbbbccddde
// Output : a3b4c2d3e
class  StringCompression {
    public static void main(String[] args) {
        String str = "aaabbbbccddde";
        String ans = "" + str.charAt(0);
        int count = 1;
        for (int i = 1;i < str.length();i++) {
            char curr = str.charAt(i);
            char prev = str.charAt(i - 1);
            if(curr == prev) {
                count++;
            }
            else {
                if (count > 1) {
                    ans += count;
                }
                count = 1;
                ans += curr;
            }
        }
        if (count > 1)
            ans += count;
        System.out.println(ans);
    }
}