class learn30 {
    public int numberOfSteps(int num) {
        int count = 0;
        while (num != 0) {
            if (num % 2 == 0) {
                num = num / 2;
                count++;
            } else if (num % 2 != 0) {
                num = num - 1;
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        learn30 obj = new learn30();
        int num = 14;
        int result = obj.numberOfSteps(num);
        System.out.println(result);
    }
}
