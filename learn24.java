//recursion
public class learn24 {
    public void num(int n) {
        if (n == 0) {
            return;
        }
        System.out.println(n);
        num(n - 1);
    }

    public static void main(String[] args) {
        learn24 obj = new learn24();
        obj.num(5);
    }
}
