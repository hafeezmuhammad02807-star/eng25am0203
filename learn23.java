public class learn23 {
    static void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println(a + " is the maximum number");
        } else if (b > a && b > c) {
            System.out.println(b + " is the maximum number");
        } else {
            System.out.println(c + " is the maximum number");
        }
    }

    public static void main(String[] args) {
        learn23.max(1, 2, 3);
    }
}
