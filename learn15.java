//METHOD OVERLOADING
public class learn15 {
    public void add(int a, int b) {
        System.out.println("Sum: " + (a + b));
    }

    public void add(int a, int b, int c) {
        System.out.println("Sum: " + (a + b + c));
    }

    public void add(double a, double b) {
        System.out.println("Sum: " + (a + b));
    }

    public static void main(String[] args) {
        learn15 a = new learn15();
        a.add(2, 3);
        a.add(2, 3, 4);
        a.add(2.5, 3.5);
    }
}