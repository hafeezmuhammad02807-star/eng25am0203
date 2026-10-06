// import java.util.*;

// class learn {
// public static void main(String[] args) {
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter a String: ");
// String s = sc.nextLine();
// int length = s.length();
// String reverse = "";
// for (int i = s.length() - 1; i >= 0; i--) {
// reverse = reverse + s.charAt(i);
// }
// System.out.println("Reverse of the string is: " + reverse);
// }
// }

class learn9 {
    public static void main(String[] args) {
        String s = "Hello, World!";
        int length = s.length();
        String reverse = "";
        for (int i = length - 1; i >= 0; i--) {
            reverse += s.charAt(i);
        }
        System.out.println("Reverse of the string is: " + reverse);
    }
}