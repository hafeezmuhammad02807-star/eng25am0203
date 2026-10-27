public class learn25 {
    public int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorial(n - 1);
    }

    public static void main(String[] args) {
        learn25 obj = new learn25();
        System.out.println(obj.factorial(5));
    }
}
