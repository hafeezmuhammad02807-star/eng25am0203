public class learn19 {
    public void max(int a, int b) {
        if (a > b) {
            System.out.println("Max value: " + a);
        } else {
            System.out.println("Max value: " + b);
        }
    }

    public void max(int a, int b, int c) {
        if (a > b && a > c) {
            System.out.println("Max value: " + a);
        } else if (b > a && b > c) {
            System.out.println("Max value: " + b);
        } else {
            System.out.println("Max value: " + c);
        }
    }

    public static void main(String[] args) {
        learn19 a = new learn19();
        a.max(10, 20);
        a.max(10, 20, 30);
    }
}