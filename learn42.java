import java.util.Scanner;

public class learn42 {
    public boolean Armstrong(int n) {
        int sum = 0;
        int temp = n;
        int l = String.valueOf(n).length();
        while (n != 0) {
            int rem = n % 10;
            sum += Math.pow(rem, l);
            n = n / 10;
        }
        if (sum == temp) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        learn42 obj = new learn42();
        if (obj.Armstrong(n)) {

            System.out.println(n + " is an Armstrong number");
        } else {
            System.out.println(n + " is not an Armstrong number");
        }
    }
}
