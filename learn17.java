public class learn17 {
    public void amount(int quatity, int price) {
        System.out.println("Total amount: " + (quatity * price));
    }

    public void amount(double quatity, double price) {
        System.out.println("Total amount: " + (quatity * price));
    }

    public static void main(String[] args) {
        learn17 a = new learn17();
        a.amount(5, 100);
        a.amount(5.5, 100.5);
    }
}
