import java.util.*;

// public class learn33 {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str = sc.nextLine();
//         String rev = " ";
//         for (int i = str.length() - 1; i >= 0; i--) {
//             rev = rev + str.charAt(i);
//         }
//         System.out.println(rev);
//     }
// }

public class learn33 {
    public void reverseString(char[] str) {
        int left = 0;
        int right = str.length - 1;
        while (left < right) {
            char temp = str[left];
            str[left] = str[right];
            str[right] = temp;
            left++;
            right--;
        }
    }

    public static void main(String[] args) {
        learn33 obj = new learn33();
        char[] str = { 'h', 'e', 'l', 'l', 'o' };
        obj.reverseString(str);
        System.out.println(str);
    }
}