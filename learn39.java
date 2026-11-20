class learn39 {
    public boolean palindrome(int n) {
        int original = n;
        int rem = 0;
        int sum = 0;
        while (n != 0) {
            rem = n % 10;
            sum = sum * 10 + rem;
            n = n / 10;
        }
        if (sum == original) {
            return true;
        } else {
            return false;
        }
    }

    public static void main(String[] args) {
        learn39 obj = new learn39();
        int n = 123;
        boolean result = obj.palindrome(n);
        System.out.println(result);
    }
}