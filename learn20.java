//static members
public class learn20 {
    int roll_no;
    String name;
    static String college = "DSU";

    learn20(int r, String n) {
        this.roll_no = r;
        this.name = n;
    }

    void display() {
        System.out.println(roll_no + " " + name + " " + college);
    }

    public static void main(String[] args) {
        learn20 s1 = new learn20(111, "Karan");
        learn20 s2 = new learn20(222, "Aryan");
        s1.display();
        s2.display();
    }
}
