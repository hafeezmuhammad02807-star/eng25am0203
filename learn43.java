// import java.util.*;

// public class learn43 {
// public String ReverseString(String s) {
// String rev = "";
// for (int i = s.length() - 1; i >= 0; i--) {
// rev += s.charAt(i);
// }
// return rev;
// }

// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the string");
// String s = sc.nextLine();
// learn43 obj = new learn43();
// String result = obj.ReverseString(s);
// System.out.println(result);
// }
// }

import java.util.*;

class learn43 {
    public String Palindrome(String s) {
        String rev = "";
        for (int i = s.length() - 1; i >= 0; i--) {
            rev += s.charAt(i);
        }
        if (s.toLowerCase().equals(rev.toLowerCase())) {
            System.out.println("The string is a palindrome");
        } else {
            System.out.println("The string is not a palindrome");
        }
        return rev;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the string");
        String s = sc.nextLine();
        learn43 obj = new learn43();
        String result = obj.Palindrome(s);
        System.out.println(result);
    }
}