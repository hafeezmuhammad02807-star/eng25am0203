class learn40 {
    public boolean isPrime(int n) {
        if (n <= 1) {
            return false;
        }
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        learn40 obj = new learn40();
        int n = 7;
        if (obj.isPrime(n)) {
            System.out.println("is prime");
        } else {
            System.out.println("is not prime");
        }
    }
}