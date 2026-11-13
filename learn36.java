public class learn36 {
    public boolean detectCapital(String word) {
        int count = 0;
        for (int i = 0; i <= word.length() - 1; i++) {
            if (Character.isUpperCase(word.charAt(i))) {
                count++;
            }
            if (count == word.length()) {
                return true;
            }
            if (count == 0) {
                return true;
            }
            if (count == 1 && Character.isUpperCase(word.charAt(0))) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        learn36 obj = new learn36();
        String word = "USA";
        System.out.println(obj.detectCapital(word));
    }
}
