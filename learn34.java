import java.util.*;

public class learn34 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ch = sc.next();
        int count = 0;
        int i = ch.length() - 1;
        while (i >= 0 && ch.charAt(i) == ' ') {
            i--;
        }
        while (i >= 0 && ch.charAt(i) != ' ') {
            count++;
            i--;
        }
        System.out.println(count);
    }
}