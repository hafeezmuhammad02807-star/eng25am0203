import java.util.Scanner;

public class learn48 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] a = new int[n];
        try {
            for (int i = 0; i < n; i++) {
                a[i] = sc.nextInt();
            }
            System.out.println(a[5]);
        } catch (Exception e) {
            System.out.println("Index is out of bounds");
        }
    }
}
