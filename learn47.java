import java.util.Scanner;

class learn47 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        try {
            int c = a / b;
            System.out.println(c);
        } catch (Exception e) {
            System.out.println("You are dividing by zero");
        }
    }
}