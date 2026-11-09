import java.math.BigInteger;

class learn32 {
    public String addBinary(String a, String b) {
        BigInteger num1 = new BigInteger(a, 2);
        BigInteger num2 = new BigInteger(b, 2);
        BigInteger sum = num1.add(num2);
        return sum.toString(2);
    }

    public static void main(String[] args) {
        learn32 obj = new learn32();
        String a = "11";
        String b = "1";
        String result = obj.addBinary(a, b);
        System.out.println(result);
    }
}