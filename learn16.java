public class learn16 {
    public void avg(int sub1, int sub2) {
        int avg = (sub1 + sub2) / 2;
        System.out.println("Average of two subjects: " + avg);
    }

    public static void main(String[] args) {
        learn16 a = new learn16();
        a.avg(80, 90);
    }
}
