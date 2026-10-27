public class learn18 {
    public void user(String name) {
        System.out.println("User name: " + name);
    }

    public void user(String name, String password) {
        System.out.println("User name: " + name);
        System.out.println("User password: " + password);
    }

    public void user(String name, String password, String OTP) {
        System.out.println("User name: " + name);
        System.out.println("User password: " + password);
        System.out.println("User OTP: " + OTP);
    }

    public static void main(String[] args) {
        learn18 a = new learn18();
        a.user("shame");
        a.user("shame", "1234");
        a.user("shame", "1234", "5678");
    }
}
