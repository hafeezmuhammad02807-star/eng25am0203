public class learn31 {
    public int commonFactors(int a, int b) {
        int count = 0;
        for (int i = 1; i <= Math.min(a, b); i++) {
            if (a % i == 0 && b % i == 0) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        learn31 obj = new learn31();
        int a = 12;
        int b = 6;
        int result = obj.commonFactors(a, b);
        System.out.println(result);
    }
}
